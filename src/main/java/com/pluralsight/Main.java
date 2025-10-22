package com.pluralsight;


public class Main {


    public static void main(String[] args) {
        Hotel testHotel = new Hotel(55,100,"TestHotel");
        Employee testEmployee = new Employee("E001", "John Doe", "Engineering", 30.0, 45);
        Reservation testReservation = new Reservation("double", 3, "Jane Smith", true);
        Room[] testRooms = new Room[]{
                new Room(false, false, 2, testHotel.maxRooms(), testReservation.pricePerNight()),
                new Room(false, false, 2, testHotel.maxRooms(),  testReservation.pricePerNight())


        };

        System.out.println(testRooms[0]);
        System.out.println(testEmployee.getOvertimeHours());
        System.out.println(testEmployee.getRegularHours());
        System.out.println(testEmployee.getHoursWorked());
        System.out.println(testRooms[1]);
        System.out.println();
        testEmployee.punchIn();
        testEmployee.punchOut();
        System.out.println(testEmployee.getOvertimeHours());
        System.out.println(testEmployee.getRegularHours());
        System.out.println(testEmployee.getHoursWorked());
    }
}
