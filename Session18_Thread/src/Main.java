import ra.MyThread;
import ra.MyThread02;

public class Main {
    public static void main(String[] args) {
        MyThread mt01 = new MyThread("Thread-01");
        MyThread mt03 = new MyThread("Thread-03");
        MyThread mt04 = new MyThread("Thread-04");
        MyThread02 mt02 = new MyThread02();
        mt01.start();
        System.out.println(mt01.getName());
        mt02.run();
        mt03.start();
        System.out.println(mt03.getName());
        mt04.start();
        System.out.println(mt04.getName());
    }
}