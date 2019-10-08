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
        System.out.println(stu1.introduction());
        System.out.println("========================");
        System.out.println(stu2.introduction());
        System.out.println("========================");
        Student stu3 = new Student("11101503", "王五", "男", 18);
        System.out.println(stu3.introduction(subject));
        Student stu4 = new Student("11101504", "赵四", "女", 18, subject);
        System.out.println("========================");
        System.out.println(stu4.introduction());
        subject.addStudent(stu1);
        subject.addStudent(stu2);
//        subject.addStudent(stu3);
        System.out.println("学科: " + subject.getSubjectName() + "   新增学生数目: " + subject.getStudentNum());
    }

}
