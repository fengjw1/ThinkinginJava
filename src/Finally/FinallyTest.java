package Finally;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 * finally 在 return执行之后return返回之前执行
 */

public class FinallyTest {

    public static void main(String [] args){

        try {
            System.out.println(test());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println();
        }

    }

    public static int test(){

        int i = 0;

        try {
            System.out.println("try block");
            return i++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block");
            if (i > 0)
                System.out.println("i : " + i);
        }

        System.out.println("out");
        return i;
    }


}
