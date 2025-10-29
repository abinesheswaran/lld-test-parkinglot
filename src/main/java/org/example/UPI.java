package org.example;

import java.time.LocalDate;

public class UPI extends Payment{
    private String account;

    public UPI(int id, int amount, String status, LocalDate date, PaymentStatus status1) {
        super(id, amount, status, date, status1);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
