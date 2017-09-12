package Enum;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */

public class EnumOrder {
    public static void main(String [] args){
        for (Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal()); //ordinal:顺序的
        }
    }
}
