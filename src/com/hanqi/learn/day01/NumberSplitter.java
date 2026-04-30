package com.hanqi.learn.day01;

import java.util.Scanner;

public class NumberSplitter {
    public static void main(String[] args) {
        //数值拆分
        System.out.println("请输入三位数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100% 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}
