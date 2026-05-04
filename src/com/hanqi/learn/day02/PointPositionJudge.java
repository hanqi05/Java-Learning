package com.hanqi.learn.day02;

import java.util.Scanner;

public class PointPositionJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x点");
        int x = sc.nextInt();
        System.out.println("请输入y点");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("原点");
        } else if (x == 0) {
            System.out.println("y轴");
        } else if (y == 0) {
            System.out.println("x轴");
        } else if (x > 0 && y > 0) {
            System.out.println("第一象限");
        } else if (x < 0 && y > 0) {
            System.out.println("第二象限");
        } else if (x < 0 && y < 0) {
            System.out.println("第三象限");
        } else {
            System.out.println("第四象限");
        }
    }
}
