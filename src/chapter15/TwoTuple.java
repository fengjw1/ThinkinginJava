package chapter15;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }
    public String toString(){
        return "( " + first + ", " + second + " )";
    }
}
