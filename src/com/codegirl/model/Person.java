package com.codegirl.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Şeyma Yılmaz on 28.7.2017.
 */
@Entity
@Table(name ="tbl_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="fullName")
    private String name;

    @Transient
    private int age;

    @Column(name="birthday")
    private Date birthdayDate;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

}
