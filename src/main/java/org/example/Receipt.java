package org.example;

abstract public class Receipt {
    private Vechicle vechicle;
    private Customer customer;
    private ParkingAgent parkingAgent;

    public Receipt(Vechicle vechicle, Customer customer, ParkingAgent parkingAgent) {
        this.vechicle = vechicle;
        this.customer = customer;
        this.parkingAgent = parkingAgent;
    }

    public Vechicle getVechicle() {
        return vechicle;
    }

    public void setVechicle(Vechicle vechicle) {
        this.vechicle = vechicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ParkingAgent getParkingAgent() {
        return parkingAgent;
    }

    public void setParkingAgent(ParkingAgent parkingAgent) {
        this.parkingAgent = parkingAgent;
    }

    abstract void generateReceipt();
}
