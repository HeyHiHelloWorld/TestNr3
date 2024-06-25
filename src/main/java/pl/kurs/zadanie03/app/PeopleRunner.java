package pl.kurs.zadanie03.app;

import pl.kurs.zadanie03.model.Employee;
import pl.kurs.zadanie03.model.Person;
import pl.kurs.zadanie03.model.Student;

import java.util.Arrays;

public class PeopleRunner {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Józek", "Kowalski", "88051906170", 4_450d);
        Employee employee2 = new Employee("Zdzichu", "Męczybuła", "88051906010", 5000.4);
        Employee employee3 = new Employee("Anna", "Kowalska", "88051906060", 5000.4);
        Student student1 = new Student("Janek", "Wolski", "88051906070", 3000.5);
        Student student2 = new Student("Janina", "Nowak", "88051906080", 3000.5);
        Person[] people = {employee1, employee2, employee3, student1, student2};

        System.out.println("Person.countNumberOfWomen(people) = " + Arrays.toString(Person.countNumberOfWomen(people)));

    }
}
