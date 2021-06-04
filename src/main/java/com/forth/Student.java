package com.forth;

import java.util.ArrayList;

public class Student {
    private  String Name;
    private  String lastName;
    private  long phoneNumber;
    private  int sSN;
    private  double gPA;
    private  int studentId;
    private  String eMail;
    Student(){};

    Student(String Name, String lastName, int phoneNumber, int sSN, double gPA, int studentId, String eMail){
        this.Name = Name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sSN = sSN;
        this.gPA = gPA;
        this.studentId = studentId;
        this.eMail = eMail;

    }


    ArrayList<String> stuFullNames = new ArrayList<String>(20);

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setsSN(int sSN) {
        this.sSN = sSN;
    }

    public double getgPA() {
        return gPA;
    }

    public void setgPA(double gPA) {
        this.gPA = gPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }public int getsSN() {
        return sSN;
    }


}
