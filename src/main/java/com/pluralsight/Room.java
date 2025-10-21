package com.pluralsight;



public class Room {
    private boolean occupied;
    private boolean dirty;
    private double price;
    private int numberOfBeds;
    private int roomNumber;
    private String bedSize;

    public Room(boolean occupied, boolean dirty, int numberOfBeds, int roomNumber, String bedSize, double price) {
        this.occupied = occupied;
        this.dirty = dirty;
        this.numberOfBeds = numberOfBeds;
        this.roomNumber = roomNumber;
        this.bedSize = bedSize;
        this.price = price;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn(){
        if(isAvailable()){
                this.occupied = true;
                this.dirty = true;}



    }

    public void checkOut(){

        this.occupied = false;
        cleanRoom();

    }

    public void cleanRoom(){
        this.dirty = false;
    }
}
