package SparseArray;

/**
 * Created by fengjw on 2017/9/27
 * Code Change The World!
 * '~' : 位非运算符（~）
 */

public class SparseArrayTest {

    public static int BinarySearch(int []a, int start, int len, int key){
        int high = start + len;
        int low = start - 1;
        int guess;

        while (high - low > 1){
            guess = (high + low) / 2;

            if (a[guess] < key)
                low = guess;
            else
                high = guess;
        }

        if (high == start + len){
            return ~(start + len);
        }
        else if (a[high] == key){
            return high;
        }
        else
            return ~high;
    }

    public static void main(String [] args){
        int i = 3;
        System.out.println(~i); //位非运算符（~）简单理解为 '加一然后取反'
    }

}
