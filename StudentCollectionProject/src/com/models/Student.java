package com.models;

import java.util.List;

public class Student {

    private int rollno;

    private String name;

    private String branch;

    private int year;

    private List<FeeDetails> feeDetails;

    private  List<Subjects> subjects;


    public Student() {
    }

    public Student(int rollno, String name, String branch, int year, List<FeeDetails> feeDetails, List<Subjects> subjects) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.feeDetails = feeDetails;
        this.subjects = subjects;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<FeeDetails> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(List<FeeDetails> feeDetails) {
        this.feeDetails = feeDetails;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                ", feeDetails=" + feeDetails +
                ", subjects=" + subjects +
                '}';
    }
}
