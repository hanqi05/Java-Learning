package com.hanqi.learn.day01;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("请输入时间");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hour = seconds / 3600;
        int minute = seconds % 3600 / 60;
        int second = seconds % 3600 % 60;
        System.out.println("hour: "+hour+" minute: "+minute+" second: "+second);
    }
}
