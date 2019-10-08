package com.imooc.model;
import com.imooc.model.Subject;

public class Student {
    // 成员属性: 学号、姓名、性别、年龄
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    // 无参构造方法
    public void Student(){

    }
    //带参数构造方法 学号、姓名、性别、年龄
    public Student(String studentNo, String studentName, String studentSex, int studentAge){
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
    }
    //带参数构造方法 学号、姓名、性别、年龄、学科对象
    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject){
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }
    //设置学生编号
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }
    //设置学生编号
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    //设置学生编号
    public void setStudentSex(String studentSex){
        if(studentSex != "男" && studentSex != "女"){
            studentSex = "男";
        }
        this.studentSex = studentSex;
    }
    //设置学生学科
    public void setStudentSubject(Subject studentSubject){
        if(studentSubject == null){
//            this.studentSubject
        }
        this.studentSubject = studentSubject;
    }
    //设置学生编号
    public void setStudentAge(int studentAge){
        if(studentAge < 10 || studentAge>100){
            studentAge = 18;
        }
        this.studentAge = studentAge;
    }
    //获取学生编号
    public String getStudentNo(){
        return this.studentNo;
    }
    //获取学生姓名
    public String getStudentName(){
       return this.studentName;
    }
    //获取学生性别
    public String getStudentSex(){
       return this.studentSex;
    }
    //获取学生年龄
    public int getStudentAge(){
        return this.studentAge;
    }
    //获取学生学科属性
    public Subject getStudentSubject(){
        if(this.studentSubject == null){
            this.studentSubject = new Subject();
        }
        return this.studentSubject;
    }
    public String introduction(){
        String result = "学生编号: " + this.getStudentNo() + "\n学生姓名: " +
                this.getStudentName() + "\n学生性别: " + this.getStudentSex() + "\n学生年龄: " + this.getStudentAge()+
                "\n专业名称: " + this.getStudentSubject().getSubjectName() + "\n学制年限: " + this.getStudentSubject().getSubjectLife();
        return  result;
    }
    public String introduction(Subject newSubject){
        String result = "学生编号: " + this.getStudentNo() + "\n学生姓名: " +
                this.getStudentName() + "\n学生性别: " + this.getStudentSex() + "\n学生年龄: " + this.getStudentAge() +
                "\n专业名称: " + newSubject.getSubjectName() + "\n学制年限: " + newSubject.getSubjectLife();
        return  result;
    }
}
