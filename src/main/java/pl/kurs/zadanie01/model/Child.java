package pl.kurs.zadanie01.model;

import pl.kurs.zadanie01.model.Gender;
import pl.kurs.zadanie01.model.Mother;

import java.util.Objects;

public class Child {
    private int id;
    Gender gender;
    private String name;
    private String dateOfBirth;
    private int weightInG;
    private int heightInCm;
    private Mother mother;

    public Child(int id, Gender gender, String name, String dateOfBirth, int weightInG, int heightInCm) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weightInG = weightInG;
        this.heightInCm = heightInCm;
    }

    public Child(int id, Gender gender, String name, String dateOfBirth, int weightInG, int heightInCm, Mother mother) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weightInG = weightInG;
        this.heightInCm = heightInCm;
        this.mother = mother;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Mother getMother() {
        return mother;
    }

    public int getWeightInG() {
        return weightInG;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", weightInG=" + weightInG +
                ", heightInCm=" + heightInCm +
                ", mother=" + mother +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child)) return false;
        Child child = (Child) o;
        return id == child.id && weightInG == child.weightInG && heightInCm == child.heightInCm && gender == child.gender && Objects.equals(name, child.name) && Objects.equals(dateOfBirth, child.dateOfBirth) && Objects.equals(mother, child.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender, name, dateOfBirth, weightInG, heightInCm, mother);
    }
}