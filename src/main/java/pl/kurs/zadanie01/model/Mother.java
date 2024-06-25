package pl.kurs.zadanie01.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mother {
    private int id;
    private String name;
    private int age;
    private List<Child> children = new ArrayList<>();

    public Mother(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addChild(Child child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Mother{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mother)) return false;
        Mother mother = (Mother) o;
        return id == mother.id && age == mother.age && Objects.equals(name, mother.name) && Objects.equals(children, mother.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, children);
    }
}
