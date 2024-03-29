package com.imooc.model;

public class Subject {
    // 成员属性：学科名称、学科编号、学制年限、学校学生、学生数量
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] subjectStudents;
    private int studentNum;

    public Subject() {

    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    // 设置学科名称
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    // 设置学科编号
    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    // 设置学科年限
    public void setSubjectLife(int subjectLife) {
        if (subjectLife < 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    // 增加学生
    public void addStudent(Student stu) {
        if (this.subjectStudents == null) {
            this.subjectStudents = new Student[200];
        }
        for (int i = 0; i < this.subjectStudents.length; i++) {
            if (this.subjectStudents[i] == null) {
                this.subjectStudents[i] = stu;
                this.studentNum =   this.studentNum + 1;
                return;
            }
        }
    }

    // 获取学科名称
    public String getSubjectName() {
        return this.subjectName;
    }

    // 获取学科编号
    public String getSubjectNo() {
        return this.subjectNo;
    }

    // 获取学科年限
    public int getSubjectLife() {
        return this.subjectLife;
    }

    // 获取学院的学生
    public Student[] getStudents() {
        return this.subjectStudents;
    }

    // 获取学生数量
    public int getStudentNum() {
        return this.studentNum;
    }

    /**
     * 返回专业介绍的相关信息
     *
     * @return
     */
    public String info() {
        String result = "学科名称: " + this.getSubjectName() + "\n学科编号: " + this.getSubjectNo() + "\n学科年限: " + this.getSubjectLife() + "年";
        return result;
    }
}
