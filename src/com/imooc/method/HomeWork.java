package com.imooc.method;

import java.util.Scanner;

public class HomeWork {
    public void insertData(int n, int[] arr) {
        System.out.println("请输入第" + n + "个数字: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr[n - 1] = num;
    }

    public void printNotice() {
        System.out.println();
        System.out.println("*************************************");
        System.out.println("1--插入数据");
        System.out.println("2--显示所有数据");
        System.out.println("3--在指定位置处插入数据");
        System.out.println("4--查询能被3整除的数据");
        System.out.println("0--退出");
        System.out.println("*************************************");
        System.out.println();
    }

    public void printArr(int[] arr) {
        System.out.println("插入后的数组为: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        hw.printNotice();
        int a = 0;
        int[] arr = new int[10];
        int[] newArr;
        int i = 0;
        do {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            a = number;
            switch (number) {
                case 1:
                    i++;
                    hw.insertData(i, arr);
                    break;
                case 2:
                    hw.printArr(arr);
                    break;
                case 0:
                    System.out.println("系统退出");
                    break;
                default:
                    break;
            }
            hw.printNotice();
        } while (a != 0);
    }
}
