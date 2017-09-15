package LinkedListTest;

import java.util.LinkedList;

/**
 * Created by fengjw on 2017/9/16
 * Code Change The World!
 */

public class UseLinkedListAsQueue {

    public static void main(String [] args){
        try{
            QueueL queueL = new QueueL();
            for (int i = 0; i < 10; i ++){
                queueL.push(i);
            }
            System.out.println("pop : " + queueL.pop());
            System.out.println("pop : " + queueL.pop());
            System.out.println("----------");
            System.out.println("top is " + queueL.top());
            System.out.println("last is "+ queueL.last());
            queueL.removeSub(0, 1);
            System.out.println("----------");
            System.out.println("top is " + queueL.top());
            System.out.println("last is "+ queueL.last());
            queueL.removeAll();
            if (queueL.isEmpty()){
                System.out.println("Queue is Empty!");
            }
            else {
                System.out.println("Queue is not Empty!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

class QueueL{
    private LinkedList list = new LinkedList();
    public void push(Object o) throws Exception{
        list.addFirst(o);
    }

    public Object pop() throws Exception{
        return list.removeLast();
    }

    public Object top() throws Exception{
        return list.getFirst();
    }

    public Object last() throws Exception{
        return  list.getLast();
    }

    public void removeAll(){
        list.clear();
    }

    public void removeSub(int x, int y) throws Exception{
        list.subList(x, y).clear();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}