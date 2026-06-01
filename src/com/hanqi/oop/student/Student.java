package com.hanqi.oop.student;

public class Student {
    private String name;
    private int age;
    private double height;
    private double weight;

    //同学的姓名
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //同学的年龄
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }

    //同学的身高
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("身高不合法");
        }
    }

    public double getHeight() {
        return height;
    }


    //同学的体重
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("体重不合法");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void learn() {
        System.out.println(name + "要好好学习");
    }
}
