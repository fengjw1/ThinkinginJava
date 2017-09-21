package ThreadOrRunnable;

/**
 * Created by fengjw on 2017/9/21
 * Code Change The World!
 */

public class MyThread extends Thread {

    private String name;
    private int Ticket = 10;

    public MyThread(String name){
        super();
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 1000; i ++) //这样才能看出多线程
            if (Ticket > 0)
        System.out.println("The Thread name is " + this.name + " Ticket is " + Ticket--);
    }

}
