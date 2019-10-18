package two.seven.six;

public class Person {
    public static int age = 35;
    //方法内部类
    /**
     * 1. 定义在方法内部，作用范围也在方法内
     * 2. 和方法内部成员使用规则一样，class 前面不可以添加 public, private, protected, static
     * 3. 类中不能包含静态成员
     * 4. 类中可以包含final, abstract 修饰的成员
     */
    public class Heart {
        public int age = 23;
        final int temp = 22;

        void say() {
            System.out.println("Hello");
        }

        public String Beat() {
            new Person().eat();
            return Person.age + "岁的心脏跳动";
        }
    }

    public Object getHeart() {
        System.out.println(new Heart().temp);
        return new Heart().Beat();
    }

    public void eat() {
        System.out.println("人在吃东西");
    }
    /**
     * 成员内部类
     * 1. 内部类在使用时，无法直接实例化，需要通过外部类信息才能完成实例化
     * 2. 内部类的访问修饰符，可以任意，但是访问范围会受到影响
     * 3. 内部类可以直接访问外部类的成员（包括属性和方法），如果同名的情况，优先使用内部类的
     * 4. 可以使用外部类.this.的成员的方式，访问外部类中同名的信息
     * 5. 外部类访问内部类信息，需要通过内部类实例，无法直接访问
     */
    /*
    public class Heart {
        int age  =23;
        int temp = 22;
        public void eat(){
            System.out.println("内部类的人要吃东西");
        }
        public String Beat() {
            Person.this.eat();
            return Person.this.age + "岁的心脏跳动";
        }
    }
    */
    /**
     * 静态内部类
     * 1. 静态内部类中，只能直接访问外部类的静态成员，非静态成员，实例化后调用
     * 2. 静态内部类的对象实例时，可以不依赖于外部类对象
     * 3. 可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
     * 4. 当内部类属性与外部类属性同名时，默认访问内部类属性，如果需要访问外部类中的静态属性，则可以通过 外部类.静态属性的方式
     * 如果需要访问外部类的非静态属性，则可以使用 new 外部类().属性
     */
      /*  public static class Heart {
       public static int age  =23;
        int temp = 22;
        static void say(){
            System.out.println("Hello");
        }
        public String Beat() {
            new Person().eat();
            return Person.age + "岁的心脏跳动";
        }
    }*/
}
