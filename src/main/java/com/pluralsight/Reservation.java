package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private String guestName;
    private boolean weekendStay;
    private double price;
    private double pricePerNight;

    public Reservation(String roomType, int numberOfNights, String guestName, boolean weekendStay) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.guestName = guestName;
        this.weekendStay = weekendStay;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public boolean isWeekendStay() {
        return weekendStay;
    }

    public void setWeekendStay(boolean weekendStay) {
        this.weekendStay = weekendStay;
    }

    public String getReservationTotal() {
        return String.format("$%1.2f",pricePerNight() * numberOfNights) ;

    }


    public double pricePerNight() {
        double perNight = 0;
        if (!weekendStay) {
            if (roomType.equalsIgnoreCase("king")) {
                perNight = this.pricePerNight = 139.00;
            } else if (roomType.equalsIgnoreCase("double")) {
                perNight = this.pricePerNight = 123.00;
            }
        }else {
            if (roomType.equalsIgnoreCase("king")) {
                perNight = this.pricePerNight = 139.00 * 1.1;
            } else if (roomType.equalsIgnoreCase("double")) {
                perNight = this.pricePerNight = 123.00 * 1.1;
            }
        }
        return perNight;
    }


}
