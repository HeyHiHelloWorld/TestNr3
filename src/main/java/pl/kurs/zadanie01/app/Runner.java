package pl.kurs.zadanie01.app;

import pl.kurs.zadanie01.model.Child;
import pl.kurs.zadanie01.model.Mother;
import pl.kurs.zadanie01.service.MotherAndChildrenService;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

//        List<Child> kids = MothersAndChildrenService.getChildrenListFromFile("noworodki.txt");
//        for (Child kid : kids) {
//            System.out.println(kid);
//        }

//        List<Mother> motherList = MothersAndChildrenService.getMothersListFromFile("mamy.txt");
//        for (Mother mother : motherList) {
//            System.out.println(mother);
//        }

//        List<Child> childList = MothersAndChildrenService.getChildrenWithMothersList("mamy.txt", "noworodki.txt");
//
//        for (Child child : childList) {
//            System.out.println(child);
//        }
//        Map<Integer, Mother> motherMap = new LinkedHashMap<>();
//        List<Mother> motherList = new ArrayList<>(motherMap.values());

//
        Map<Integer, Mother> motherMap = MotherAndChildrenService.getMotherMapFromFile("mamy.txt");
        List<Child> children = MotherAndChildrenService.getChildrenListFromFile("noworodki.txt", motherMap);

//        MotherAndChildrenService.getNamesAndBirthsOfGirlsWhoInheritedMotherNames(children);
//        List<Mother> motherList = new ArrayList<>(motherMap.values());

        List<Child> childList = MotherAndChildrenService.findTallestBoyAndGirl(children);

        for (Child child : childList) {
            System.out.println(child);
        }

//        List<Mother> mothers = MotherAndChildrenService.findMothersWhoGaveBirthToBabiesOver4000g(children);
//
//        for (Mother mother : mothers) {
//            System.out.println(mother);
//        }

//        List<String> motherNames = MotherAndChildrenService.getNamesAndBirthsOfGirlsWhoInheritedMotherNames(children);
//
//        for (String motherName : motherNames) {
//            System.out.println(motherName);
//        }

//        List<Mother> mothersWithTwins = MotherAndChildrenService.findMothersWhoGaveBirthToTwins(children);
//
//        for (Mother mothersWithTwin : mothersWithTwins) {
//            System.out.println(mothersWithTwin);
//        }



    }
}
