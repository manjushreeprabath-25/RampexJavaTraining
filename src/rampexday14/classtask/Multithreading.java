package rampexday14.classtask;




public class Multithreading {


    public static void main(String[] args) {

        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt);

        t1.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("main thread  working : " + (char)i);
        }
    }
}
class MyThread extends Thread{
    //by Extending the Thread class


    @Override
    public void run() {

        for (int i = 1; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
    }
}
