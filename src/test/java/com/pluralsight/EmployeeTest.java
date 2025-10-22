package com.pluralsight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    static Scanner scanner = new Scanner(System.in);

    private final InputStream originalSystemIn = System.in;
    private ByteArrayInputStream testIn;



    @AfterEach
    public void restoreSystemIn() {
        // Restore System.in after each test
        System.setIn(originalSystemIn);
    }

    @Test
    void punchIn() {
        Employee testEmployee = new Employee("test","test","testing",10,0);
        double testTime = 15;

        testEmployee.punchIn(testTime);

        assertEquals(testTime,testEmployee.getLastClockIn());
    }

    @Test
    void punchOut() {
        Employee testEmployee = new Employee("test","test","testing",10,0);
        double startTime = 5;
        double testTime = 20;

        testEmployee.punchIn(startTime);
        testEmployee.punchOut(testTime);

        double workedHours = testTime - startTime;

        assertEquals(workedHours,testEmployee.getHoursWorked());
    }


    @Test
    void punchTimeCard_punch_in_test() {


        String time = "16";
        testIn = new ByteArrayInputStream(time.getBytes());
        System.setIn(testIn);
        String key = "in";
        Employee testEmployee = new Employee("test","test","testing",10,0);

        testEmployee.punchTimeCard(key);


        double expected = Double.parseDouble(time);
        double actual = testEmployee.getLastClockIn();
        assertEquals(expected,actual);
    }


    @Test
    void punchTimeCard_punch_in_test_no_parameter() {


        String key = "in";
        testIn = new ByteArrayInputStream(key.getBytes());
        System.setIn(testIn);
        Employee testEmployee = new Employee("test","test","testing",10,0);

        testEmployee.punchTimeCard();

        LocalDateTime startTime = LocalDateTime.now();
        double minute = startTime.getMinute();
        double expected = startTime.getHour() + (minute/60);
        double actual = testEmployee.getLastClockIn();
        assertEquals(expected,actual);
    }
}