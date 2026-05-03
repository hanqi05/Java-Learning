package com.hanqi.learn.day02;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        // 练习1：判断正负数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num=sc.nextInt();
        if (num>0) {
            System.out.println("正数");
        }
        else if (num<0){
            System.out.println("负数");
        }
        else {
            System.out.println("0");
        }
        System.out.println("---------------------");
        // 练习2：成绩等级
        System.out.println("请输入你的成绩");
        int score=sc.nextInt();
        if (score>=90)
            System.out.println("A");
        else if (score>=80)
            System.out.println("B");
        else if (score>=70)
            System.out.println("C");
        else if (score>=60)
            System.out.println("D");
        else
            System.out.println("E");
        System.out.println("---------------------");
        // 练习3：判断闰年
        System.out.println("请输入一个年份");
        int year=sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0)
            System.out.println("闰年");
        else
            System.out.println("平年");
        System.out.println("---------------------");
        // 练习4：判断三角形
        System.out.println("请输入三角形的三边");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("是三角形");
        }
        else{
            System.out.println("不是三角形");
        }
    }
}
