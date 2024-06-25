package pl.kurs.zadanie03.model;

public class Student extends Person {
    private String group;
    private double scholarship;

    public Student(String name, String surname, String pesel, double scholarship) {
        super(name, surname, pesel);
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

}
