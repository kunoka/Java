package three.five;
 class PrintRunnable implements Runnable{
     int i=1;

     public void run(){
        while(i<=10){
            System.out.println(Thread.currentThread().getName()+"线程正在执行!" + i++);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1 = new Thread(pr);
        t1.start();
//        PrintRunnable pr1 = new PrintRunnable();
        Thread t2 = new Thread(pr);
        t2.start();

    }
}
