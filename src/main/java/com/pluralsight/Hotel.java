package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms,roomCounter;

    public Hotel(int numberOfSuites, int numberOfRooms, String name) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.name = name;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
       if(isSuite){
           if(getAvailableSuites() >= numberOfRooms){
               bookedSuites += numberOfRooms;
               return true;
           }

       }else{
           if(getAvailableRooms() >= numberOfRooms){
               bookedBasicRooms += numberOfRooms;
               return true;
           }
       }
       return false;
    }


    public int maxRooms(){
        int maxRoom = this.numberOfSuites + this.numberOfRooms;

        if (roomCounter < maxRoom){
            roomCounter++;
        }

        return roomCounter;
    }


    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public String getName() {
        return name;
    }
}
