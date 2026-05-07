package com.hanqi.learn.day03;

import java.util.Scanner;

public class FallThroughPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        switch (month) {
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            case 12, 1, 2 -> System.out.println("Winter");
            default -> System.out.println("Invalid month");
        }
    }
}
