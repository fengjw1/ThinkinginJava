package chapter5;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class Rock {
    public Rock(){
        System.out.println("Rock()!");
    }

    public Rock(String x){
        System.out.println(x);
    }

    public Rock(String x, int y){
        this();
    }

    public static void main(String [] args){
        Rock rock = new Rock();
        Rock rock1 = new Rock("Rock had value!");
        Rock rock2 = new Rock("Rock had two value!", 1); //这里调用了Rock()构造方法!
    }

}
