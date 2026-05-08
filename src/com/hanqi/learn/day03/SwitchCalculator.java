package com.hanqi.learn.day03;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字");
        double b = sc.nextDouble();
        System.out.println("请输入运算符");
        char op = sc.next().charAt(0);
        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b != 0) {
                    yield a / b;
                } else{
                System.out.println("除数不能为0");
                yield -1;
                }
            }
            default -> 0;
        };
        System.out.println(result);
    }
}
