package chapter7;

import chapter6.Print;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class Father {
    public Father(){
        System.out.println("father!");
    }

    public Father(int i){
        System.out.println("i = " + i);
    }

    public Father(String str){
        System.out.println(str);
    }

    protected String test(){
        return "protected";
    }

    private String test(String str){
        return str;
    }
    public static void play(Father father){
        System.out.println("father play!");
    }

    public static void main(String [] args){
        Son son = new Son();
        Print.print(son.test("father"));
    }




}
