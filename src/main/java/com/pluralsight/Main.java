package com.pluralsight;


public class Main {


    public static void main(String[] args) {
        Employee testEmployee = new Employee("E001", "John Doe", "Engineering", 30.0, 45);

        Reservation testReservation = new Reservation("double", 3, "Jane Smith", true);
        Room testRoom = new Room(false, false,  2, 101, "double", testReservation.pricePerNight());

        System.out.println(testEmployee.getOvertimeHours());
        System.out.println(testEmployee.getRegularHours());
        System.out.println(testEmployee.getHoursWorked());
        testEmployee.punchTimeCard("in");
        testEmployee.punchTimeCard("out");
        System.out.println(testEmployee.getOvertimeHours());
        System.out.println(testEmployee.getRegularHours());
        System.out.println(testEmployee.getHoursWorked());
    }
}
