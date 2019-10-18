package two.seven.homework;

import java.net.ServerSocket;
import java.util.Scanner;

public class test {
    public void handleInput(int num) {
        switch (num) {
            case 1:
                Bear bear = new Bear("棕熊", 12);
                bear.act();
                break;
            case 2:
                Lion lion = new Lion("Lain", 2, true, "灰色");
                lion.act();
                break;
            case 3:
                Monkey monkey = new Monkey("Tom", 1, "越南金丝猴");
                monkey.act();
                break;
            case 4:
                Parrot parrot = new Parrot("Rose", 1,  "印度金刚鹦鹉");
                parrot.act();
                break;
            case 5:
                Clown clown = new Clown("Kahle", 5,"身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
                clown.act();
                break;
            default:
                System.out.println("输入错误");
                break;
        }

    }

    public static void main(String[] args) {
        int num;
        do {
            System.out.println("********欢迎来到太阳马戏团🎪********");
            System.out.println("**********  请选择表演者   **********");
            System.out.println("**********     1.棕熊     **********");
            System.out.println("**********     2.狮子     **********");
            System.out.println("**********     3.猴子    **********");
            System.out.println("**********     4.鹦鹉     **********");
            System.out.println("**********     5.小丑     **********");
            Scanner s = new Scanner(System.in);
            num = s.nextInt();
            System.out.println("您输入的是: " + num);
            test a = new test();
            a.handleInput(num);
            System.out.println("是否继续观看（1/0）");
            Scanner sc2 = new Scanner(System.in);
            int con = sc2.nextInt();
            if (con == 0) break;
        } while (num < 6);
    }
}
