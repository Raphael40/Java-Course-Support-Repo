package main.java.methods;

import java.util.ArrayList;

public class Hospital {

    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        Patient Rory = new Patient("Rory", 26);
        Patient Gina = new Patient("Gina", 24);

        Rory.updateCondition("food poisoning");
        Gina.updateCondition("Covid-19");

        Hospital.addPatient(Rory);
        Hospital.addPatient(Gina);

        Hospital.listPatients();
    }

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void listPatients() {
        for (Patient patient : patients) {
            System.out.println("Name: " + patient.getName() + " Age: " + patient.getAge() + " Condition: " + patient.getCondition());
        }
    }
}
