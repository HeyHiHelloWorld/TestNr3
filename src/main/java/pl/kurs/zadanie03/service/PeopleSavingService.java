package pl.kurs.zadanie03.service;

import pl.kurs.zadanie03.model.Person;
import pl.kurs.zadanie04.model.Figure;

import java.io.*;
import java.util.List;

public class PeopleSavingService {

    public static void readAndSaveList(String fileName, List<Person> people) {
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            people = (List<Person>) ois.readObject();
            if (people != null) {
                saveList(fileName, people);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveList(String fileName, List<Person> people) {
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
