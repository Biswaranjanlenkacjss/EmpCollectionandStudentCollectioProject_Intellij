package com.models;

import java.util.List;

public class SubjectMarks {

    private int totalMark;

    private int obtainMark;

    public SubjectMarks() {
    }

    public SubjectMarks(int totalMark, int obtainMark) {
        this.totalMark = totalMark;
        this.obtainMark = obtainMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getObtainMark() {
        return obtainMark;
    }

    public void setObtainMark(int obtainMark) {
        this.obtainMark = obtainMark;
    }

    @Override
    public String toString() {
        return "SubjectMarks{" +
                "totalMark=" + totalMark +
                ", obtainMark=" + obtainMark +
                '}';
    }
}
