package chapter3;

import java.util.Random;

/**
 * Created by fengjw on 2017/9/2
 * Code Change The World!
 */

public class MathOps {
    public static void main(String [] args){
        Random rand = new Random(47); //提供的种子用于生成随机数，种子不同生成的随机数不同，
            //如果种子是固定的，那么生成的随机数应该是固定的。
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j + 1 = " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k + 1 = " + k);
        i = j + k;
        System.out.println("j + k = " + i);
        i = j - k;
        System.out.println("j - k = " + i);

    }
}
