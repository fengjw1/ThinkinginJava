package chapter3;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

class Latter{
    char c;
}

public class PassObject {

    static void f(Latter y){
        y.c = 'z';
    }

    public static void main(String [] args){
        Latter x = new Latter();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
    }
}
