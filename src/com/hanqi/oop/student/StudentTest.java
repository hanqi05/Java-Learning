package com.hanqi.oop.student;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);

        //大一信息
        System.out.println("大一的信息");
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        s.learn();
        System.out.println();


        //大二信息
        System.out.println("大二的信息");
        s.setAge(s.getAge()+1);
        s.setWeight(s.getWeight()+10);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        System.out.println();


        //大三信息
        System.out.println("大三的信息");
        s.setAge(s.getAge()+1);
        s.setWeight(s.getWeight()-3);
        s.setHeight(s.getHeight()+2);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        System.out.println();


        //大四信息
        System.out.println("大四的信息");
        s.setAge(s.getAge()+1);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        System.out.println();


        //毕业信息
        System.out.println("毕业的信息");
        s.setAge(s.getAge()+1);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
    }
}
