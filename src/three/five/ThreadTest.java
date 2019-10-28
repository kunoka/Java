package three.five;

class MyThread1 extends Thread {
    MyThread1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(getName() + "线程正在运行" + i);
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("线程1");
        MyThread1 mt2 = new MyThread1("线程2");
        mt1.start();
        mt2.start();

    }
}
