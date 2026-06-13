package com.hanqi.oop.doctor;

public class Doctor {
    private String name;
    private int age;

    public Doctor() {
    }

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void save(Doctor target) {
        System.out.println(this.name+"医生"+"给"+target.age+"岁的"+target.name+"进行治疗");
    }
}
