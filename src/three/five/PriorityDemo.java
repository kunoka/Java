package three.five;

class MyThreadPriority extends Thread{
    @Override
    public void run() {
        System.out.println("子张程的优先级为: " + Thread.currentThread().getPriority());
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "正在执行" + i);
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        MyThreadPriority mt = new MyThreadPriority();
        mt.setPriority(Thread.MAX_PRIORITY);
        mt.start();
        System.out.println("主线程的优先级为: " + Thread.currentThread().getPriority());
    }
}
