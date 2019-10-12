package com.imooc.test;

import com.imooc.practice.Earth;
import com.imooc.practice.King;

public class PracticeTest {
    public static void main(String[] args) {
        King one = King.getInstance();
        King two = King.getInstance();

        System.out.println(one == two);
        System.out.println(one);
        System.out.println(two);

        System.out.println("==================");
        Earth one1 = Earth.getInstance();
        Earth two1 = Earth.getInstance();
        System.out.println(one == two);
        System.out.println(one1);
        System.out.println(two1);
    }
}
