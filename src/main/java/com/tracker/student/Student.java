package com.tracker.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private Integer age;

    //TODO:No Call Constructor
    public Student() {}

    //TODO:Everything Constructor
    public Student(Long id, String name, LocalDate dob, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }

    //TODO:No ID Constructor
    public Student(String name, LocalDate dob, String email, Integer age) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }



    //TODO:Getters And Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    //TODO: To String

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
