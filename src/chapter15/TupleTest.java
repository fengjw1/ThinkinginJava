package chapter15;


/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class TupleTest {
    static TwoTuple<String, Integer> f(){
        return new TwoTuple<>("hi", 21);
    }

    static ThreeTuple<String, String, Integer> g(){
        return new ThreeTuple<>("fengjw", "hi", 1);
    }

    public static void main(String [] args){
        TwoTuple<String, Integer> twoTuple = f();
        System.out.println(twoTuple);
        System.out.println(g());
    }
}
