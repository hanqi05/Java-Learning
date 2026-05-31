package com.hanqi.learn.day05;

import java.util.Scanner;

public class EvenMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = sc.nextInt();
        boolean flag=isEven(num);
        if (flag){
            System.out.println(num+"是偶数");
        }else{
            System.out.println(num+"是奇数");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
