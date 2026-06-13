package com.hanqi.oop.doctor;

public class DoctorTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Leo",30 );
        Doctor patient = new Doctor("小王", 18);

        doctor.save(patient);

    }
}
