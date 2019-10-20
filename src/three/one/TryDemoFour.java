package three.one;

import java.util.Scanner;

public class TryDemoFour {
    public static void main(String[] args) {
        try{
            testAge();
        }catch (HotelAgeException e){
            System.out.println(e.getMessage());
            System.out.println("请前台不给予办理入住");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /** throw 抛出异常对象的处理方案
     * 方式1： 通过 try, catch 包含 throw 语句--自己抛出的异常自己处理
     * 方式2：通过throws在方法声明处抛出异常类型 - 谁调用谁处理，可以自己处理也可以向上抛
     * 此时可以抛出相机的数据类型或者是父类
     * @throws Exception
     */
    private static void testAge() throws HotelAgeException {
        System.out.print("请输入年龄: ");
        Scanner one = new Scanner(System.in);
        int age = one.nextInt();
        if(age < 18 || age >80){
            throw new HotelAgeException();
//            throw new Exception("年龄小于18，大于80的需要亲属陪同才能入住");
//            System.out.println("年龄小于18，大于80的需要亲属陪同才能入住");
        }else{
            System.out.println("欢迎入住本酒店");
        }
    }
}
