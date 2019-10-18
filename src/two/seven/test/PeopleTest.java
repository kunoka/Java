package two.seven.test;

import two.seven.six.Person;

public class PeopleTest {
    public static void main(String[] args) {
        Person lily = new Person();
//        lily.age = 14;

       /*
       // 获取内部类对象实例， 方式1: new 外部类.new 内部类
        Person.Heart myHeart = new Person().new Heart();
        System.out.println(myHeart.Beat());

        // 获取内部类对象实例， 方式2: 外部类对象.new 内部类
        myHeart = lily.new Heart();
        System.out.println(myHeart.Beat());

        // 获取内部类对象实例， 方式3: 外部类对象 获取方法
        myHeart = lily.getHeart();
        System.out.println(myHeart.Beat());
        */
       // 静态类中的调用
//        Person.Heart myHeart = new Person.Heart();
        System.out.println(lily.getHeart());
    }
}
