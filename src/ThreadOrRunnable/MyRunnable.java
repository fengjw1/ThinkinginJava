package ThreadOrRunnable;

/**
 * Created by fengjw on 2017/9/21
 * Code Change The World!
 */

public class MyRunnable implements Runnable {

    private String name;
    private int Ticket = 10;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i ++){
            if (Ticket > 0)
            System.out.println("The Thread name is " + this.name + " Ticket is " + Ticket--);
        }
    }
}
