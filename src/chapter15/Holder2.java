package chapter15;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

class Automobile{}

public class Holder2 {

    private Object object;
    public Holder2(Object obj){
        this.object = obj;
    }

    public Object getObject() {
        return object;
    }
    public void setObject(Object o){
        this.object = o;
    }

    public static void main(String [] args){
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.getObject();
        holder2.setObject("Not an Automobile!");
        String s = (String) holder2.getObject();
        holder2.setObject(1);
    }

}
