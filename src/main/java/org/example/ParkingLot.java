package org.example;

abstract public class ParkingLot {
    private boolean isAvailable = false;
    private String location;
    private String building;
    private int floor;

    public ParkingLot(String location, String building, int floor) {
        this.location = location;
        this.building = building;
        this.floor = floor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
