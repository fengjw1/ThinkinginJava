package chapter6;

import chapter7.Father;
import chapter7.Son;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class Print {
    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void print(){
        System.out.println();
    }


    public static void main(String [] args){
        Son son = new Son();
        Father father = new Father();
        //print(father.test);//获取不到test方法!

    }

}
