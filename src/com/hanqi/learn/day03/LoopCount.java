package com.hanqi.learn.day03;

import java.util.Scanner;

public class LoopCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        int count = 0;
        int max=(a>b)?a:b;
        int min=(a<b)?a:b;
        for (int i = min; i <=max ; i++) {
            if (i % 3 == 0&&i % 5 == 0){
                count++;
            }
        }
        if (count==0){
            System.out.println(min+"~"+max+"之前没有满足要求的数字");
        }else {
            System.out.println(min+"~"+max+"之间共有"+count+"个满足要求的数字");
        }
    }
}
