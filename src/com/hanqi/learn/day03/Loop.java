package com.hanqi.learn.day03;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int MaxHp = 200;
        Scanner sc = new Scanner(System.in);
        double damage = 0;
        while (true) {
            System.out.println("受到的伤害");
            damage = sc.nextDouble();
            if (damage > 0) {
                break;
            } else {
                System.out.println("error");
            }
        }


        double hp = 0;
        if (MaxHp - damage <= 0) {
            hp = 1;
        } else {
            hp = MaxHp - damage;
        }
        System.out.println("剩余血量" + hp);

        double skill = 0;
        while (true) {
            System.out.println("技能恢复的血量");
            skill = sc.nextDouble();
            if (skill > 0) {
                break;
            } else {
                System.out.println("error");
            }
        }

        hp += skill;
        if (hp > MaxHp) {
            hp = 200;
        }
        System.out.println("最后血量" + hp);

    }
}
