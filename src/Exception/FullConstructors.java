package Exception;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */

class MyException extends Exception{
    public MyException(){
    }
    public MyException(String e){
        super(e);
    }
}

public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String [] args){
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out); //目的是输出错误信息
        }

        try {
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }

}
