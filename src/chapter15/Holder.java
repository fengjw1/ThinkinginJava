package chapter15;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class Holder<T> {
    private T a;
    public Holder(T a){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }
    public static void main(String [] args){
        Holder<Automobile> automobileHolder = new Holder<Automobile>(new Automobile());
        Automobile a = automobileHolder.get();
    }
}
