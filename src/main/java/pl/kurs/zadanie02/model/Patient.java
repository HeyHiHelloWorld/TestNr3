package pl.kurs.zadanie02.model;

import java.util.Objects;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String pesel;
    private String birthDate;

    public Patient(int id, String surname, String name, String pesel, String birthDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.pesel = pesel;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(surname, patient.surname) && Objects.equals(name, patient.name) && Objects.equals(pesel, patient.pesel) && Objects.equals(birthDate, patient.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, pesel, birthDate);
    }
}
