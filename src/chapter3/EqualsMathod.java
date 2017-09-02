package chapter3;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

class Value{
    char c;
}

public class EqualsMathod {
    public static void main(String [] args){
        Value a = new Value();
        Value b = new Value();
        a.c = 'z';
        b.c = 'z';
        System.out.println(a.equals(b));
        System.out.println(a.c == b.c);
        System.out.println(a == b);
    }
}
