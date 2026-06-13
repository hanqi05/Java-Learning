package com.hanqi.oop.game;

public class GameTest {
    public static void main(String[] args) {
        GameRole r1 = new GameRole("JOJO", 20);
        GameRole r2 = new GameRole("Dio", 20);

        while (true) {
            r1.attack(r2);
            if (r2.getHp() == 0) {
                System.out.println(r1.getName() + "已击杀" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getHp() == 0) {
                System.out.println(r2.getName() + "已击杀" + r1.getName());
                break;
            }

        }

    }
}
