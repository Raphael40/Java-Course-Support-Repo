package main.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    @DisplayName("Patient class instance test")
    void patientInstanceTest() {
        Patient marco = new Patient("Marco", 30);

        assertEquals(Patient.class, marco.getClass());
    }

    @Test
    @DisplayName("Patient class get methods test")
    void getMethodsTest() {
        Patient issy = new Patient("Issy", 58);

        // Call the methods
        String issyName = issy.getName();
        int issyAge = issy.getAge();
        String issyCondition = issy.getCondition();

        System.out.println(issy);

        // Make Assertions
        assertEquals(issyName, "Issy");
        assertEquals(issyAge, 58);
        assertEquals(issyCondition, "unknown");
    }

    @Test
    @DisplayName("Patient class updateCondition method test")
    void updateConditionTest() {
        Patient sacha = new Patient("Sacha", 22);

        // Starting condition
        String sachaCondition = sacha.getCondition();
        assertEquals(sachaCondition, "unknown");

        sacha.updateCondition("Shingles"); /// Poor sacha he's so young!!

        String sachaNewCondition = sacha.getCondition();
        assertEquals(sachaNewCondition, "Shingles");
    }
}