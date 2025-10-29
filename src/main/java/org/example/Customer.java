package org.example;

import java.util.List;

public class Customer extends Person{

    private Vechicle vechicle;
    private List<Receipt> receipts;

    public Customer(int id, String address, String name, int age, String phoneNumber, String email, Vechicle vechicle) {
        super(id, address, name, age, phoneNumber, email);
        this.vechicle = vechicle;
    }

    public Vechicle getVechicle() {
        return vechicle;
    }

    public void setVechicle(Vechicle vechicle) {
        this.vechicle = vechicle;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }
}
