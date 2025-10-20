package com.pluralsight;

public class Employee {
    private String employeeId,name,department;
    private double payRate,hoursWorked;
    private boolean overtime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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
        return this.hoursWorked * this.payRate;
    }




}
