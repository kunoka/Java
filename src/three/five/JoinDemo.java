package three.five;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(getName() + "正在执行!" + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            mt.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程正在执行" + i);

        }
    }
}
