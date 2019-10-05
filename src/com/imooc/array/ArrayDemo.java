package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[0]);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i+1) + "个元素:");
            a[i] = sc.nextInt();
        }
        System.out.print("输入的数组是: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.println("使用增强型for循环");
        for(int n:a){
            System.out.print(n + "  ");
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println();
        System.out.println("数组的总和是: " + sum);
    }
}
