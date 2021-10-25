package com.company.models;

import com.company.controllers.GetStudent;

public class Student {
    private String student;
    private GetStudent studentGetter;

    public Student() {
        studentGetter=new GetStudent();
        setStudent();
    }

    public String getStudent() {
        return student;
    }

    public void setStudent() {
        student =studentGetter.getGradedStudent();
    }

}
