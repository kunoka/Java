package three.three;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //定义一个字符串"你好"
        StringBuilder str = new StringBuilder("你好");
        //在你好后面添加内容，将字符串变成"你好，imooc!"
        str.append("，").append("imooc!");
        System.out.println(str);
        //将字符串变成 你好，iMOOC!
//        str = str.delete(4,8).insert(4,"MOOC");
        str.replace(4,8,"MOOC");
        System.out.println(str);
        //1. 使用delete方法删除mooc,然后再插入MOOC
        //2. 使用replace方法直接替换
        //在字符串"你好，iMOOC"中取出你好并输出
        System.out.println(str.substring(0,2));

        StringBuilder s = new StringBuilder("abcdefg");
        s.delete(2,4).insert(3, "CD");
        System.out.println(s.toString());
    }
}
