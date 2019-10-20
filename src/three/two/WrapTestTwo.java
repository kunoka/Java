package three.two;

public class WrapTestTwo {
    public static void main(String[] args) {
//        //基本数据类型黑的为字符串
//        int t1 =2;
//        String t2 = Integer.toString(t1);
//        //测试
//        System.out.println("int类型转换为String类型对象t2="+t2);
//        System.out.println("****************************");
//        //字符串转换为基本数据类型
//        //1.包装类的parse
//        int t3 = Integer.parseInt(t2);
//        //2.包装类的valueOf先将字符串转换为包装类，再通过自动拆箱完成基本类型转换
//        int t4 = Integer.valueOf(t2);
//
//        int t5 = new Integer(t1);
//        int t6 = new Integer(t1);
//        System.out.println(t5==t6);
        int t1 = 10;
        Integer one = new Integer(t1);
        Integer two = new Integer(t1);
        System.out.println("one==two的结果 : " + (one == two));

        Integer three = 100;
        System.out.println("three==100的结果: " + (three==100));

        Integer four = 100;
        System.out.println("three==four的结果: " + (three==four));

        Integer five =200;
        System.out.println("five==200的结果: " + (five==200));

        Integer six = 200;
        System.out.println("five==six的结果: " + (five==six));

        Double seven = 123.0;
        Double eight = 123.0;
        System.out.println("seven == 100的值: " + (seven==123));
        System.out.println("seven == eight的值: " + (seven==eight));
    }
}
