package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机科学与技术","111015", 4);
        System.out.println(subject.info());
        System.out.println("========================");
        Student stu1 = new Student("11101501", "张三", "男", 20);
        Student stu2 = new Student("11101502", "李四", "女", 19);
        System.out.println(stu1.studentInfo());
        System.out.println("========================");
        System.out.println(stu2.studentInfo());
    }

}
