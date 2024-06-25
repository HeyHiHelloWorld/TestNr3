package pl.kurs.zadanie01.service;

import pl.kurs.zadanie01.model.Child;
import pl.kurs.zadanie01.model.Gender;
import pl.kurs.zadanie01.model.Mother;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MotherAndChildrenService {


    private static Mother mapStringToMother(String s) {
        String[] tokens = s.split(" ");
        List<Mother> mothers = new ArrayList<>();
        Mother mother = new Mother(
                Integer.parseInt(tokens[0]),
                tokens[1],
                Integer.parseInt(tokens[2]));
        mothers.add(mother);
        return mother;
    }

    public static Map<Integer, Mother> getMotherMapFromFile(String filePath) {
        Map<Integer, Mother> motherMap = new LinkedHashMap<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                Mother mother = mapStringToMother(line);
                motherMap.put(mother.getId(), mother);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return motherMap;
    }

    private static Child mapStringToChild(String s, Map<Integer, Mother> motherMap) {
        String[] tokens = s.split(" ");
        return new Child(
                Integer.parseInt(tokens[0]),
                tokens[1].equals("s") ? Gender.MALE : Gender.FEMALE,
                tokens[2],
                tokens[3],
                Integer.parseInt(tokens[4]),
                Integer.parseInt(tokens[5]),
                motherMap.get(Integer.parseInt(tokens[6]))
        );
    }

    public static List<Child> getChildrenListFromFile(String filePath, Map<Integer, Mother> motherMap) {
        List<Child> children = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                children.add(mapStringToChild(line, motherMap));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return children;
    }

    private List<Child> assignChildToMother(Map<Child, Integer> childMotherIdMap, Map<Integer, Mother> motherMap) {
        List<Child> list = new ArrayList<>();
        Set<Map.Entry<Child, Integer>> childMotherIdEntries = childMotherIdMap.entrySet();
        for (Map.Entry<Child, Integer> childMotherIdEntry : childMotherIdEntries) {
            childMotherIdEntry.getKey().setMother(motherMap.get(childMotherIdEntry.getValue()));
            list.add(childMotherIdEntry.getKey());
        }
        return list;
    }

    public static void findTallestBoyAndGirl(List<Child> children) {
        Child tallestBoy = children.get(0);
        Child tallestGirl = children.get(0);

        for (Child child : children) {
            if (child.getGender() == Gender.MALE && tallestBoy.getHeightInCm() < child.getHeightInCm()) {
                tallestBoy = child;
            }
            if (child.getGender() == Gender.FEMALE && tallestGirl.getHeightInCm() < child.getHeightInCm()) {
                tallestGirl = child;
            }
        }
        System.out.println("Tallest boy: " + tallestBoy.getName() + ", height: " + tallestBoy.getHeightInCm());
        System.out.println("Tallest girl: " + tallestGirl.getName() + ", height: " + tallestGirl.getHeightInCm());
    }

    public static String findMothersWhoGaveBirthToBabiesOver4000g(List<Child> children) {
        String motherNames = null;
        for (Child child : children) {
            if (child.getWeightInG() > 4000 && child.getMother().getAge() < 25) {
                motherNames += child.getMother().getName();
            }
        }
        return motherNames;
    }

    public static void getNamesAndBirthsOfGirlsWhoInheritedMotherNames(List<Child> children) {
        List<String> temp = new ArrayList<>();

        for (Child child : children) {
            if (child.getGender() == Gender.FEMALE && child.getName().equals(child.getMother().getName())) {
                temp.add(child.getName() + " " + child.getDateOfBirth());
            }
        }
        System.out.println(temp);
    }
}

