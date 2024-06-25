package pl.kurs.zadanie02.service;

import pl.kurs.zadanie02.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DoctorsAndPatientsService {

    private static Patient mapStringToPatient(String s) {
        String[] tokens = s.split("\t");
        List<Patient> patientList = new ArrayList<>();
        Patient patient = new Patient(
                Integer.parseInt(tokens[0]), tokens[1],
                tokens[2], tokens[3], tokens[4]);
        patientList.add(patient);
        return patient;
    }

    public static List<Patient> getPatientsListFromFile(String filePath) {
        List<Patient> patients = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                patients.add(mapStringToPatient(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patients;
    }

    private static Doctor mapStringToDoctor(String s) {
        String[] tokens = s.split("\t");
        List<Doctor> doctorList = new ArrayList<>();
        Doctor doctor = new Doctor(
                Integer.parseInt(tokens[0]),
                tokens[1], tokens[2],
                Specialty.valueOf(tokens[3]),
                tokens[4], tokens[5], tokens[6]);
        doctorList.add(doctor);
        return doctor;
    }

    public static List<Doctor> getDoctorsListFromFile(String filePath) {
        List<Doctor> doctors = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                doctors.add(mapStringToDoctor(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doctors;
    }

    private static Appointment mapStringToAppointment(String s) {
        String[] tokens = s.split("\t");
        List<Appointment> appointmentList = new ArrayList<>();
        Appointment appointment = new Appointment(
                mapStringToDoctor(tokens[0]),
                mapStringToPatient(tokens[1]),
                tokens[2]);
        appointmentList.add(appointment);
        return appointment;
    }

    public static List<Appointment> getAppointmentsListFromFile(String filePath) {
        List<Appointment> appointmentList = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                appointmentList.add(mapStringToAppointment(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appointmentList;
    }

    public static List<Doctor> getFiveOldestDoctors(List<Doctor> doctorList) {
        doctorList.sort(new DoctorAgeComparator());
        List<Doctor> doctorsTempList = doctorList.subList(0, 5);
        Doctor oldestDoctor = doctorList.get(0);

        for (int i = 0; i < doctorList.size(); i++) {
            doctorsTempList.add(oldestDoctor);
            oldestDoctor = doctorsTempList.get(i);
            if (i == 5) {
                break;
            }
        }
        return doctorsTempList;
    }

}