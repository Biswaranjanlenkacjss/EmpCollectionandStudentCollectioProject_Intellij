package com.models;

import java.time.LocalDate;

public class FeeDetails {

    private double feeAmount;

    private LocalDate date;

    public FeeDetails() {
    }

    public FeeDetails(double feeAmount, LocalDate date) {
        this.feeAmount = feeAmount;
        this.date = date;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FeeDetails{" +
                "feeAmount=" + feeAmount +
                ", date=" + date +
                '}';
    }


}
