package LinkedListTest;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fengjw on 2017/9/16
 * Code Change The World!
 *
 * http://blog.csdn.net/i_lovefish/article/details/8042883
 */

public class LinkedListTest {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("--------链表-------");
        for (String s : list){
            System.out.println(s);
        }

        //生成子链表
        System.out.println("-------生成子链表--------");
        List list1 = list.subList(1,4);
        for (Object s : list1){
            System.out.println(s);
        }
        System.out.println("-------删除--------");
        list1.remove(2);//删除
        for (Object s : list1){
            System.out.println(s);
        }
        System.out.println("---------------");


    }
}
