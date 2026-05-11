package com.hanqi.learn.day03;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("请输入一个数字");
            num = sc.nextInt();
            if (num >= 2) {
                break;
            } else {
                System.out.println("请输入一个大于2的数字");
            }
        }
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }
}
