package chapter7;

import chapter6.Print;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class Son extends Father{

    public Son(){
        System.out.println("Son!");
    }

    public Son(int x){
        System.out.println("x = " + x);
    }

    public Son(String string){
        System.out.println(string);
    }

    protected String test(String str){
        return str;
    }

    public static void main(String [] args){
        Son son = new Son();
        Son son1 = new Son(1);
        Son son2 = new Son("test"); //每次都会调用一次继承extends父类的默认构造方法。
        Father father = new Father();
        Print.print(father.test());
        //Print.print(father.test("test")); 这里不行，protected只能向下访问！
        Father.play(son);
    }

}
