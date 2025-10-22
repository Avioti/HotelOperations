package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Employee {

    public static Scanner scanner = new Scanner(System.in);
    private String employeeId,name,department;
    private double payRate,hoursWorked,lastClockIn;
    private boolean overtime;




    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getLastClockIn() {
        return lastClockIn;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    public boolean isOvertime() {
        return this.hoursWorked > 40;
    }

    public double getRegularHours() {
        double hours = 0;
        if (isOvertime()) {
            hours = 40;
        }else{
            hours = this.hoursWorked;
        }
        return hours;


    }

    public double getOvertimeHours(){
        double hours = 0;
        if(isOvertime()){
            hours = this.hoursWorked - 40;
        }
        return hours;
    }

    public double getTotalPay(){
        double regularPay = this.payRate * getRegularHours();

        double overtimePay = (this.payRate * 1.5) * getOvertimeHours();

        return regularPay + overtimePay;
    }

    public void punchTimeCard(String key) {
        double startTime = 0;
        if (key.equalsIgnoreCase("in")) {
            System.out.println("Enter Start Time (00.00)");
            startTime = scanner.nextDouble();
            lastClockIn = startTime;
            System.out.println("Punch in time: " + startTime);

        } else if (key.equalsIgnoreCase("out")) {
            if(lastClockIn == 0){
                System.out.println("Error No Punch In Detected");
            }else{
            System.out.println("Enter End time (00.00)");
            double endTime = scanner.nextDouble();
            double totalTime = Math.abs(lastClockIn - endTime);

            System.out.println("Punch out time: " + endTime);
            System.out.println("Hours worked: " + totalTime);
            hoursWorked += totalTime;
            lastClockIn = 0;}
        }
    }

    public void punchIn(double time){
        lastClockIn = time;
        System.out.println("Punch in time: " + time);
    }

    public void punchOut(double time){
        if(lastClockIn == 0){
            System.out.println("Error No Punch In Detected");
        }else{
            double totalTime = Math.abs(lastClockIn - time);
            System.out.println("Punch out time: " + time);
            System.out.println("Hours worked: " + totalTime);
            hoursWorked += totalTime;
            lastClockIn = 0;}
    }

    public void punchIn(){
        LocalDateTime startTime = LocalDateTime.now().minusHours(2);

        double hour = startTime.getHour();

        double minute = startTime.getMinute();

        lastClockIn = hour + (minute/60);

        System.out.println("Punch in time: " + startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd | HH:mm")));
    }

    public void punchOut(){
        LocalDateTime startTime = LocalDateTime.now();

        double hour = startTime.getHour();

        double minute = startTime.getMinute();

        double endTime = hour + (minute/60);

        if(lastClockIn == 0){
            System.out.println("Error No Punch In Detected");
        }else{
            double totalTime = Math.abs(lastClockIn - endTime);
            System.out.println("Punch out time: " + startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd | HH:mm")));

            System.out.println("Hours worked: " + totalTime);
            hoursWorked += totalTime;
            lastClockIn = 0;}
    }

    public void punchTimeCard() {
        System.out.println("Are you clocking in or Out?");
        System.out.print("Enter: ");

        String key = scanner.nextLine();


        if (key.equalsIgnoreCase("in")) {
            LocalDateTime startTime = LocalDateTime.now().minusHours(2);

            double hour = startTime.getHour();

            double minute = startTime.getMinute();

            lastClockIn = hour + (minute/60);

            System.out.println("Punch in time: " + startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd | HH:mm")));

        } else if (key.equalsIgnoreCase("out")) {
            LocalDateTime startTime = LocalDateTime.now();

            double hour = startTime.getHour();

            double minute = startTime.getMinute();

            double endTime = hour + (minute/60);

            if(lastClockIn == 0){
                System.out.println("Error No Punch In Detected");
            }else{
                double totalTime = Math.abs(lastClockIn - endTime);
                System.out.println("Punch out time: " + startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd | HH:mm")));

                System.out.println("Hours worked: " + totalTime);
                hoursWorked += totalTime;
                lastClockIn = 0;}
        }
    }

}
