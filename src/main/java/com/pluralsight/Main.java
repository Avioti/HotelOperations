package com.pluralsight;


public class Main {


    public static void main(String[] args) {
        Employee testEmployee = new Employee("E001", "John Doe", "Engineering", 30.0, 45);
        Room testRoom = new Room(false, false,  2, 101, "double", 124.00);
        Reservation testReservation = new Reservation("double", 3, "Jane Smith", true);


        System.out.println(testEmployee.getOvertimeHours());
        System.out.println(testReservation.getReservationTotal());
        System.out.println(testRoom.isAvailable());
    }
}
