package pl.kurs.zadanie03.model;

public abstract class Person {
    private String name;
    private String surname;
    private String pesel;
    private String city;

    public abstract double getIncome();

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public static Person getPersonWithHighestIncome(Person[] personsArray) {
        Person personWithHighestIncome = personsArray[0];
        for (int i = 1; i < personsArray.length; i++) {
            if (personWithHighestIncome.getIncome() < personsArray[i].getIncome()) {
                personWithHighestIncome = personsArray[i];
            }
        }
        return personWithHighestIncome;
    }

    public void getSex(String pesel) {
        if (pesel == null)
            System.out.println("Pesel niepoprawny");
        if (pesel.length() != 11)
            System.out.println("Pesel musi mieć 11 znaków!");
        else if (Integer.parseInt(pesel.substring(8, 10)) % 2 == 0) {
            System.out.println("Kobieta");
        } else {
            System.out.println("Mężczyzna");
        }
    }

    public static Person[] countNumberOfWomen(Person[] people) {
        int womenCounter = 0;

        for (int i = 0; i < people.length; i++) {
            if (Integer.parseInt(people[i].pesel.substring(8, 10)) % 2 == 0) {
                womenCounter++;
            }
        }
        Person[] numberOfWomen = new Person[womenCounter];
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            if (Integer.parseInt(people[i].pesel.substring(8, 10)) % 2 == 0) {
                numberOfWomen[index] = people[i];
                index++;
            }
        }
        return numberOfWomen;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personID='" + pesel + '\'' +
                '}';
    }
}
