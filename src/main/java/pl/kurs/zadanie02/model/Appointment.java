package pl.kurs.zadanie02.model;

import java.util.Objects;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(doctor, that.doctor) && Objects.equals(patient, that.patient) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, patient, date);
    }
}
