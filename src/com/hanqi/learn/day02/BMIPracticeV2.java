package com.hanqi.learn.day02;

import java.util.Scanner;

public class BMIPracticeV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体重(kg)");
        double weight = sc.nextDouble();
        System.out.println("请输入你的身高(m)");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("你的BMI是：" + BMI);
        if (BMI < 18.5) {
            System.out.println("过轻");
        } else if (BMI < 23.9) {
            System.out.println("正常");
        } else if (BMI < 26.9) {
            System.out.println("过重");
        } else if (BMI < 29.9) {
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }
}
