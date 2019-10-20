package three.one;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args) {
        try {
            System.out.println("=======程序开始运行======");
            System.out.print("请输入第一个参数: ");
            Scanner sc1 = new Scanner(System.in);
            int one = sc1.nextInt();
            System.out.print("请输入第二个参数: ");
            Scanner sc2 = new Scanner(System.in);
            int two = sc2.nextInt();
            System.out.println("one和two的商是: " + (one / two));
        } catch (ArithmeticException e) {
            System.exit(1);
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出错啦");
            e.printStackTrace();
        }
        finally {
            System.out.println("========系统运行结束========");
        }
    }
    /**
     *
     */
}
