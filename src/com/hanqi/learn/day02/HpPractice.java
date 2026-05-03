package com.hanqi.learn.day02;

import java.util.Scanner;

public class HpPractice {
    public static void main(String[] args) {
        int MaxBlood=200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受到的伤害");
        int hurt = sc.nextInt();
        int blood=MaxBlood-hurt;
        if (blood<=0){
            blood=1;//如果受到致命伤害，触发保命机制，血量变成 1
        }else {
            blood = MaxBlood-hurt;
        }
        System.out.println("剩余血量"+blood);

        System.out.println("请输入回复的血量");
        int add = sc.nextInt();
        if (blood+add>MaxBlood){
            System.out.println("血量"+MaxBlood);
        }else{
            System.out.println("血量"+ (blood+add));
        }

    }
}
