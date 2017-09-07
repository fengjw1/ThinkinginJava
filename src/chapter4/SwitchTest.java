package chapter4;

import chapter2.StaticTest;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class SwitchTest {

    private static int outTestNum(int x){
        int temp = 0;
        switch (x){
            case 1:
                temp = 1;
                break;
            case 2:
                temp = 2;
                break;
            default:
                temp = 3;
                break;
        }
        return temp;
    }

    public static void main(String [] args){
        int outNum = outTestNum(5);
        System.out.println(outNum);
    }
}
