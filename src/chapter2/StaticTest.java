package chapter2;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class StaticTest {
    static int i = 27;
    int j = 20;
    final static String LOG = "fengjw";
    static int get(){
        return 100;
    }

    static{
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

}
