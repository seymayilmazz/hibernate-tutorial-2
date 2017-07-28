package com.codegirl;

import com.codegirl.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Şeyma Yılmaz on 28.7.2017.
 */
public class HibernateTest {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        configuration.configure();

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Person person1=new Person();
        person1.setName("Şeyma yılmaz");
        person1.setAge(23);

        Date birthDayPerson1 = null;
        try {
            birthDayPerson1 = simpleDateFormat.parse("18/03/1994");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        person1.setBirthdayDate(birthDayPerson1);

        session.save(person1);

        Person person2=new Person();
        person2.setName("Burak Köken");
        person2.setAge(23);
        Date birthDayPerson2 = null;
        try {
            birthDayPerson2 = simpleDateFormat.parse("29/06/1995");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        person2.setBirthdayDate(birthDayPerson2);

        session.save(person2);

        session.getTransaction().commit();
        session.close();


    }
}
