package com.hanqi.learn.day03;

import java.util.Scanner;

public class LoopLoop {
    public static void main(String[] args) {
/*        System.out.println("正三角");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("倒三角");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("平行四边形");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("梯形");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("*");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

 /*       System.out.println("菱形");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <=3 ; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.print("*");

            for (int j = 2; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=7 ; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=2 ; j++) {
                System.out.print("*");
            }

            System.out.print("*");

            for (int j = i; j <=2 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/

        System.out.println("空心菱形");
        for (int i = 1; i <=3 ; i++) {
            for (int j = i; j <=2 ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2; j <=i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
