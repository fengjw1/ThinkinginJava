package other;

/**
 * Created by fengjw on 2017/10/26
 * Code Change The World!
 */

public class BreakOrContinue {

    public static void main(String [] args){

        useBreak();
        useContinue();

    }

    private static void useBreak(){
        output("break : ");
        for (int i = 0; i < 10; i ++){
            if (i == 4){
                break;
            }
            output(i + "\t");
        }
        output("\n");
    }

    private static void useContinue(){
        output("continue : ");
        for (int i = 0; i < 10; i ++){
            if (i == 4){
                continue;
            }
            output(i + "\t");
        }
    }


    private static void output(Object o){
        System.out.print(o);
    }

}
