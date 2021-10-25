package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetStudent {
    private String gradedStudent;
    private int size;
    private int index;

    public GetStudent() {
        try {
            Path studentList = Path.of("src/" + "students.txt");

            BufferedReader in = new BufferedReader(new FileReader(String.valueOf(studentList)));

            List<String> students= new ArrayList<>();

            String student;

            try{
                student = in.readLine();

                while(student !=null){
                    students.add(student);
                    student = in.readLine();
                }
                in.close();
                String[] allStudents = students.toArray(new String[students.size()]);
                setSize(students.size());

                gradedStudent=getRandomStudent(allStudents);
            }catch(IOException e){
                e.printStackTrace();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getGradedStudent() {
        return gradedStudent;
    }

    private String getRandomStudent(String[] allStudents){
        int rand=new Random().nextInt(allStudents.length);
        return allStudents[rand];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
