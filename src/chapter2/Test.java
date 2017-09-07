package chapter2;

import static chapter2.StaticTest.LOG;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class Test {
    public static void main(String [] args){
        StaticTest test1 = new StaticTest();
        StaticTest test2 = new StaticTest();
        System.out.println(StaticTest.i);
        //System.out.println(StaticTest.j);
        //StaticTest.i
        System.out.println(StaticTest.get());
        String LogTest = LOG;
    }
}
