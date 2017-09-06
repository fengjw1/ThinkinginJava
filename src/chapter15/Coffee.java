package chapter15;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class Coffee {
    private static long counter = 0;
    private final long id = counter ++;
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }

}



