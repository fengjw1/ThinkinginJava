package ThreadOrRunnable;

/**
 * Created by fengjw on 2017/9/21
 * Code Change The World!
 */

public class ThreadTest {
    public static void main(String [] args){
//        MyThread myThread1 = new MyThread("Thread 1");
//        MyThread myThread2 = new MyThread("Thread 2");
//        /*myThread1.run();
//        myThread2.run();*/
//        myThread1.start();
//        myThread2.start();

        MyRunnable myRunnable1 = new MyRunnable("Thread 1");
        MyRunnable myRunnable2 = new MyRunnable("Thread 2");
        new Thread(myRunnable1).start();
        //new Thread(myRunnable2).start();
        new Thread(myRunnable1).start();
        new Thread(myRunnable1).start();
        /*
        同一个资源申请了三个线程，使用runnable可以实现共享
        如果使用Thread,则无法对同一个资源关联起来
         */

    }
}
