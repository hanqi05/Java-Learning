package com.hanqi.learn.day03;

import java.util.Scanner;

public class Pass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("请输入一个数");
            num = sc.nextInt();
            if (num >= 0) {
                break;
            } else {
                System.out.println("error");
            }
        }

        for (int i = 1; i <= num; i++) {
            int x = i;
            boolean flag = false;
            while (x > 0) {
                int temp = x % 10;
                if (temp == 4) {
                    flag = true;
                    break;
                }
                x /= 10;
            }

            if (i % 4 == 0 || flag) {
                continue;
            }

            System.out.println(i);
        }
    }
}
