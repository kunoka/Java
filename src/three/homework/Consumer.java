package three.homework;

public class Consumer implements Runnable {
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(300);
                queue.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
