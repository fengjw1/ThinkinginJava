package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fengjw on 2018/3/27
 * Code Change The World!
 */

public class IteratorExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("java语言", "c语言", "c++语言");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            next = "修改后的";
            System.out.println(next);
        }
        System.out.println(list);
    }
}
