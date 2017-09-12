package Enum;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */

public class SimpleEnumUse {
    public static void main(String [] args){
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot); //自动添加了toString()方法
    }
}
