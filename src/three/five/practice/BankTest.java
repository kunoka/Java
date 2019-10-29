package three.five.practice;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank("10001", 1000);
        System.out.println("初始化值为:" + bank);

        SaveAccount sa = new SaveAccount(bank);
        DrawAccount da = new DrawAccount(bank);

        Thread save = new Thread(sa);
        Thread draw = new Thread(da);

        save.start();
        draw.start();

        try {
            save.join();
            draw.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
