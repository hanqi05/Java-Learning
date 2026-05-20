package com.hanqi.learn.day03;

public class SevenPass {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("pass");
                continue;
            }
            System.out.println(i);
        }
    }
}
