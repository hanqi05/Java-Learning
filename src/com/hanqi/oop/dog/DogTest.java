package com.hanqi.oop.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("小白");
        d.setAge(2);
        d.setColour("white");

        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getColour());

        d.eat();
    }
}
