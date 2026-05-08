package com.hanqi.learn.day03;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();
        int sum=0;
        if (a<0){
            a=-a;
        }
        while (a!=0){
               sum+=a%10;
               a/=10;
           }
        System.out.println(sum);
    }
}
