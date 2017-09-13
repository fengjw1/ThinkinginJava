package learnInterface;

/**
 * Created by fengjw on 2017/9/13
 * Code Change The World!
 */

public class InterfaceTest implements ShowTips {

    public static void main(String [] args){

        InterfaceTest mTest = new InterfaceTest(); //没有new实例是无法引用方法的，因为没有new就不会在内存中
        mTest.showHowToWork();                     //占有位置

    }


    @Override
    public void showHowToWork() {
        System.out.println(tip + "\nfengjw!");
    }
}
