package com.company.controllers;

import com.company.models.Student;
import com.company.views.DisplayGrade;
import com.company.views.StartProgram;


public class Main {
    public static StartProgram gameStart;
    private static GetStudent sizeGetter;

    public static void main(String[] args) {
        gameStart=new StartProgram();
        sizeGetter=new GetStudent();
        gameStart.DisplayStart();
        setStudents();
    }
    public static void setStudents(){
        int arraySize;
        arraySize=sizeGetter.getSize();
        String[] allStudents = new String[arraySize];
        DisplayGrade display = new DisplayGrade();

        for (int i=0;i<arraySize;i++){
            Student getStudent = new Student();
            SetGrade grade = new SetGrade();
            String studentName = getStudent.getStudent();
            int percentInt = grade.getRandomGrade();
            String letterGrade = grade.getRandomLetterGrade();
            allStudents[i]=studentName + " " + percentInt + "% "+ letterGrade;

        }
        display.FullDisplay(allStudents,arraySize);

    }
}
