package learnInterface;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class Test {
    public static void main(String [] args){
        Apple apple = new Apple(5,"mather");
        Banana banana = new Banana(3,"father");
        System.out.println("name = " + apple.getStr() + " count = " + apple.getInt());
        System.out.println("name = " + banana.getStr() + " count = " + banana.getInt());

    }
}
