package com.pluralsight;



public class Room {
    private boolean occupied;
    private boolean dirty;
    private double price;
    private int numberOfBeds;
    private int roomNumber;

    public Room(boolean occupied, boolean dirty, int numberOfBeds, int roomNumber, double price) {
        this.occupied = occupied;
        this.dirty = dirty;
        this.numberOfBeds = numberOfBeds;
        this.roomNumber = roomNumber;
        this.price = price;
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
        this.dirty = true;


    }

    public boolean cleanRoom(){
        if(!this.occupied){
            this.dirty = false;
            return true;
        }
     return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "occupied=" + occupied +
                ", dirty=" + dirty +
                ", price=" + price +
                ", numberOfBeds=" + numberOfBeds +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
