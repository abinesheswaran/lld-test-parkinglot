package org.example;

import java.time.LocalDate;

abstract public class Payment {
    private int id;
    private int amount;
    private String Status;
    private LocalDate Date;
    private PaymentStatus status;

    public Payment(int id, int amount, String status, LocalDate date, PaymentStatus status1) {
        this.id = id;
        this.amount = amount;
        Status = status;
        Date = date;
        this.status = status1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
