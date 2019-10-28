package three.five;

 class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行！" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread t = new Thread(mt);
        t.start();
        Thread t1 = new Thread(mt);
        t1.start();
    }
}
