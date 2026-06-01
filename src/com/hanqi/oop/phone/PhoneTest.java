package com.hanqi.oop.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.name="Samsung";
        p.price=999.9;
        p.color="white";

        System.out.println(p.name);
        System.out.println(p.price+"$");
        System.out.println(p.color);

        p.telephone();
        p.playGames();
    }
}
