package com.company.controllers;

import java.util.Random;

public class SetGrade {
    private int randomGrade;
    private String randomLetterGrade;

    public SetGrade() {
        setRandomGrade();
        setRandomLetterGrade();
    }

    public int getRandomGrade() {
        return randomGrade;
    }

    public void setRandomGrade() {
        Random rand =new Random();
        randomGrade=rand.nextInt(100)+1;
    }

    public String getRandomLetterGrade() {
        return randomLetterGrade;
    }

    public void setRandomLetterGrade() {
        if (randomGrade >=90){
            randomLetterGrade= "A";
        }else if (randomGrade >=80){
            randomLetterGrade= "B";
        }else if (randomGrade >=70){
            randomLetterGrade= "C";
        }else if (randomGrade >=60){
            randomLetterGrade= "D";
        }else{
            randomLetterGrade= "F";
        }
    }
}
