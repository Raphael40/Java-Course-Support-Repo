package main.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {

    @Test
    @DisplayName("Hospital addPatient() method")
    void testAddPatient() {
        Patient testPatient = new Patient("Test", 30);
        testPatient.updateCondition("Test condition");

        Hospital.addPatient(testPatient);

        assertEquals(1, Hospital.patients.size());
    }

    @Test
    @DisplayName("Hospital addPatient() method")
    void testListRecords() {
        // Create and add our first patient
        Patient testPatient = new Patient("Test", 30);
        testPatient.updateCondition("Test condition");
        Hospital.addPatient(testPatient);

        // Create and add our second patient
        Patient testPatient2 = new Patient("Test2", 32);
        testPatient2.updateCondition("Test condition 2");
        Hospital.addPatient(testPatient2);

        // create a new ArrayList equal to our expected output
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Test is 30 years old and has: Test condition");
        expectedOutput.add("Test2 is 32 years old and has: Test condition 2");

        assertEquals(expectedOutput, Hospital.listRecords());
    }
}