package three.homework;

public class Queue {
    private int i = 0;
    boolean flag;

    public synchronized int get() {
        //如果有消费者，等待
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者:" + i);
        flag = false;
        notifyAll();
        return i;
    }

    public synchronized void set(int i) {
        //如果有生产者，等待
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产者:" + i);
        flag = true;
        notifyAll();
        this.i = i;
    }
}
