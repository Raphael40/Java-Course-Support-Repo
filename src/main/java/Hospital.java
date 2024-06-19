package main.java;

import java.util.ArrayList;

public class Hospital {
    // A static ArrayList exists in the class
    static ArrayList<String> patients = new ArrayList<>();

    public static void main(String[] args) {
        // Create instances of the Patient class
        Patient Rory = new Patient("Rory", 26);
        Patient Gina = new Patient("Gina", 24);

        // Make changes to the patient class by calling the updateCondition method
        Rory.updateCondition("food poisoning");
        Gina.updateCondition("Covid-19");

        Hospital.addPatient(Rory);
        Hospital.addPatient(Gina);


        System.out.println(Hospital.listRecords());
    }

    public static void addPatient(Patient patient) {
        String record = patient.getName() + " is " + patient.getAge() + " years old and has: " + patient.getCondition();

        // Add record made of data from Patients class to the patients array
        patients.add(record);
    }

    public static ArrayList<String> listRecords() {
        return patients;
    }
}
