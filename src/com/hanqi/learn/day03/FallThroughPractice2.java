package com.hanqi.learn.day03;

import java.util.Scanner;

public class FallThroughPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        String season = switch (month) {
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            case 12, 1, 2 -> "Winter";
            default ->"Invalid month";
        };
        System.out.println(season);
    }
}
