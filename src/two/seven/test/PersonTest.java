package two.seven.test;

import two.seven.anonymous.Man;
import two.seven.anonymous.Person;
import two.seven.anonymous.Woman;

public class PersonTest {
    // 方案1：调用方法传入不同的参数
//    public void getRead(Man man){
//        man.read();
//    }
//    public void getRead(Woman woman){
//        woman.read();
//    }
    //方案2
    public void getRead(Person person){
        person.read();
    }
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        pt.getRead(one);
//        pt.getRead(two);

        // 方案3 匿名内部类
        /** 匿名内部类
         * 1. 匿名内部类没有类型名称，实例对象名称
         * 2. 编译后的文件命名：外部类$数字.class
         * 3. 无法使用 private, public, protected, abstract,static 修饰
         * 4. 无法编写构造方法，可以添加构造代码块
         * 5. 不能出现静态成员
         * 6. 匿名内部类可以实现接口也可以继承父类，但是不可兼得
         */
        // 代码太长，只使用一次，类在定义后马上用到，给类命名并不会导致代码更容易被理解
        pt.getRead(new Person() {
             int month=5;
            @Override
            public void read() {
                System.out.println(month + "男人喜欢读科幻小说");
            }
        });
        pt.getRead(new Person() {
            @Override
            public void read() {
                System.out.print("女人喜欢读言情小说");
            }
        });
    }
}
