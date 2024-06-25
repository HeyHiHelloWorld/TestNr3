package pl.kurs.zadanie02.model;

import java.util.Objects;

public class Doctor {
    private int id;
    private String surname;
    private String name;
    private Specialty specialty;
    private String birthDate;
    private String nip;
    private String pesel;

    public Doctor(int id, String surname, String name, Specialty specialty, String birthDate, String nip, String pesel) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.specialty = specialty;
        this.birthDate = birthDate;
        this.nip = nip;
        this.pesel = pesel;
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getNip() {
        return nip;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", specialty=" + specialty +
                ", birthDate='" + birthDate + '\'' +
                ", nip='" + nip + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(surname, doctor.surname) && Objects.equals(name, doctor.name) && specialty == doctor.specialty && Objects.equals(birthDate, doctor.birthDate) && Objects.equals(nip, doctor.nip) && Objects.equals(pesel, doctor.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, specialty, birthDate, nip, pesel);
    }
}
