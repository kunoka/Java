package three.homework;

public class Producer implements Runnable{
    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep(300);
                queue.set(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
