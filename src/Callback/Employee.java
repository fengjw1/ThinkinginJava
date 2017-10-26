package Callback;

/**
 * Created by fengjw on 2017/9/30
 * Code Change The World!
 */

public class Employee {

    private Callback mCb;

    public interface Callback {
        public abstract void work();
    }

    public void setCallback(Callback callback){
        this.mCb = callback;
    }

    public void doWork(){
        mCb.work();
    }


    public static void main(String [] args){

        Boss boss = new Boss();
    }

}
