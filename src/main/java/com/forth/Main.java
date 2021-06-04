package com.forth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        Student studentFour = new Student();
        Student studentFive = new Student();
        Student studentSix = new Student();
        Student studentSeven = new Student();
        Student studentEight = new Student();
        Student studentNine = new Student();
        Student studentTen = new Student();
        studentOne.setName("Tom");
        studentOne.setLastName("Cruise");
        studentOne.setPhoneNumber(713222890);
        studentOne.setStudentId(1234);
        studentOne.seteMail("TheCruise@scientology.com");
        studentOne.setgPA(3.7);
        studentOne.setsSN(666666666);
        StudentDatabaseDao test = new StudentDatabaseDao();

        test.Start();
    }

}