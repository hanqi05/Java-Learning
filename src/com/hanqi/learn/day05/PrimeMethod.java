package com.hanqi.learn.day05;

import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入一个数");
            num = sc.nextInt();
            if (num >= 2) {
                break;
            } else {
                System.out.println("请输入一个大于2的数");
            }
        }
        isPrime(num);
    }

    public static void isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num+"不是素数");
                return;
            }
        }
        System.out.println(num+"是素数");
    }
}
