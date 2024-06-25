package pl.kurs.zadanie02.model;

import java.util.Comparator;

public class DoctorAgeComparator implements Comparator<Doctor> {

    @Override
    public int compare(Doctor o1, Doctor o2) {
        return o2.getBirthDate().compareTo(o1.getBirthDate());
    }
}
