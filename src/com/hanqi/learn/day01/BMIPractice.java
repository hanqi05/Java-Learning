package com.hanqi.learn.day01;

import java.util.Scanner;

public class BMIPractice {
    public static void main(String[] args) {
        //计算BMI
        //BMI=weight / (height*height)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体重(kg)");
        double weight= sc.nextDouble();
        System.out.println("请输入你的身高(m)");
        double height= sc.nextDouble();

        double BMI=weight/(height*height);
        System.out.printf("你的BMI的值为：%.2f\n",BMI);
    }
}
