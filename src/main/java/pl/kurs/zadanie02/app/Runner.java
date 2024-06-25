package pl.kurs.zadanie02.app;

import pl.kurs.zadanie02.model.Appointment;
import pl.kurs.zadanie02.model.Doctor;
import pl.kurs.zadanie02.model.Patient;
import pl.kurs.zadanie02.service.DoctorsAndPatientsService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Patient> patientList = DoctorsAndPatientsService.getPatientsListFromFile("pacjenci.txt");
        for (Patient patient : patientList) {
            System.out.println(patient);
        }

//        List<Doctor> doctorList = DoctorsAndPatientsService.getDoctorsListFromFile("lekarze.txt");
//        for (Doctor doctor : doctorList) {
//            System.out.println(doctor);
//        }
//        List<Appointment> appointmentList = DoctorsAndPatientsService.getAppointmentsListFromFile("wizyty.txt");
//        for (Appointment appointment : appointmentList) {
//            System.out.println(appointment);
//        }

    }
}
