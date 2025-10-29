package org.example;

import java.time.LocalDate;

public class Cash extends Payment{
    public Cash(int id, int amount, String status, LocalDate date, PaymentStatus status1) {
        super(id, amount, status, date, status1);
    }
}
