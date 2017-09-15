package LinkedListTest;

import java.util.LinkedList;

/**
 * Created by fengjw on 2017/9/16
 * Code Change The World!
 */

public class UseLinkedListAsStack {

    public static void main(String [] args){
        StackL stackL = new StackL();
        for (int i = 0; i < 10; i ++){
            stackL.push(i);
        }

        System.out.println(stackL.top());

        System.out.println("-----出栈-------");
        stackL.pop();
        stackL.pop();

        System.out.println("top is " + stackL.top());

    }

}

class StackL{
    private LinkedList<Object> list = new LinkedList<>();

    public void push(Object o){
        list.addFirst(o);
    }

    public Object top(){
        return list.getFirst();
    }

    public Object pop(){
        return list.removeFirst();
    }

}