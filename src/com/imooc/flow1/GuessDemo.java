package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        int guess;
        int time = 0;
        System.out.println("请输入一个1到100之间的数");
        do {
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("太大");
            } else if (guess < number) {
                System.out.println("太小");
            }
            time++;
        } while (guess != number);
        System.out.println("恭喜您第" + time + "次猜中,答案是" + number);
    }
}
