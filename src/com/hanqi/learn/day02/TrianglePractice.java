package com.hanqi.learn.day02;

import java.util.Scanner;

public class TrianglePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三边");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("等边三角形");
            } else if(a==b||a==c||b==c){
                System.out.println("等腰三角形");
            } else if (a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b) {
                System.out.println("直角三角形");
            }else {
                System.out.println("普通三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
    }

}
