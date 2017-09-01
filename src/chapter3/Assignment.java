package chapter3;

/**
 * Created by fengjw on 2017/9/1
 * Code Change The World!
 */

public class Assignment {
    public static void main(String [] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.setLevel(9);
        t2.setLevel(42);
        System.out.println(t1.getLevel());
        System.out.println(t2.getLevel());
        t1 = t2;
        t1.setLevel(15);
        System.out.println(t1.getLevel());
        System.out.println(t2.getLevel());
        //t1,t2使用的是同一个对象，将t2赋值给t1意味着
        //t2和t1共用同一个对象.改变其中一个实例的值，另一个跟着改变
        t2.setLevel(51);
        System.out.println(t1.getLevel());
        System.out.println(t2.getLevel());//验证猜想
    }
}
