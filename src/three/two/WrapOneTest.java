package three.two;

public class WrapOneTest {
    public static void main(String[] args) {
        //装箱
        // 1. 自动装箱
        int t1 = 2;
        Integer t2 = t1;
        // 2. 手动装箱
        int t3 =new Integer(t1);
        // 测试
        System.out.println("t1的值是: " + t1);
        System.out.println("自动装箱t2的值是: " + t2);
        System.out.println("手动装箱t3的值是: " + t3);
        System.out.println(t2==t3);
        //拆箱
        // 1.自动拆箱
        int t4 = t2;
        // 2.手动拆箱
        int t5 = t2.intValue();
        System.out.println("手动拆箱t4的值是: "+ t4);
        System.out.println("自动拆箱t5的值是: "+ t5);
        System.out.println(t4==t5);
        //测试
    }
}
