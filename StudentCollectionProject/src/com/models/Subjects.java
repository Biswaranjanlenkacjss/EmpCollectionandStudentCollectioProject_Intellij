package com.models;

public class Subjects {
    private String subjectCode;

    private String subjectName;

     private SubjectMarks subjectMarks;

    public Subjects() {
    }

    public Subjects(String subjectCode, String subjectName, SubjectMarks subjectMarks) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectMarks = subjectMarks;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public SubjectMarks getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(SubjectMarks subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectMarks=" + subjectMarks +
                '}';
    }

}
