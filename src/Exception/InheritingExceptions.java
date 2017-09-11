package Exception;

/**
 * Created by fengjw on 2017/9/11
 * Code Change The World!
 */


class SimpleException extends Exception{}


public class InheritingExceptions {

    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();//这里会执行Class SimpleException.
    }

    public static void main(String [] args){
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        }catch (SimpleException e){
            System.out.println("Caught it!");
        }
    }

}
