package com.hanqi.learn.day03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 101);
        System.out.println(number);
        int count = 0;//保底， 3次 告诉你范围 ；10次告诉你的数字

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字：");
            int guessNumber = sc.nextInt();

            count++;

            if (guessNumber > number) {
                System.out.println("猜的数字太大了");
            } else if (guessNumber < number) {
                System.out.println("猜的数字太小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }

            if (count == 3) {
                if (number+5>100){
                    System.out.println("范围在" + (number - 5) + "~" + "100之间");
                } else if (number-5<0) {
                    System.out.println("范围在1" + "~" + (number + 5) + "之间");
                }else{
                    System.out.println("范围在" + (number - 5) + "~" + (number + 5) + "之间");
                }
            } else if (count == 10) {
                System.out.println("正确的数是：" + number);
                break;
            }
        }

    }
}
