package com.hanqi.oop.collegeStudent;

public class CollegeStudentTest {
    public static void main(String[] args) {
        CollegeStudent c1 = new CollegeStudent("张三", 18);

        c1.study();
        c1.eat();
        c1.sleep();

        c1.setAge(c1.getAge()+1);
        System.out.println(c1.getName() + "," + c1.getAge());

        System.out.println("---------------");

        CollegeStudent c2 = new CollegeStudent();
        c2.setName("李四");
        c2.setAge(19);

        c2.study();
        c2.eat();
        c2.sleep();

        c2.setAge(c2.getAge()+1);
        System.out.println(c2.getName() + "," + c2.getAge());
    }
}
