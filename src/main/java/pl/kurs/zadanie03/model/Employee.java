package pl.kurs.zadanie03.model;

public class Employee extends Person{
    private String grade;
    private double salary;

    public Employee(String name, String surname, String pesel, double salary) {
        super(name, surname, pesel);
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }

}
