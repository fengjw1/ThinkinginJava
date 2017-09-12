package Enum;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */

public class Burrito { //burrito:玉米煎饼
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree = degree;
    }
    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case FLAMING:
                break;
            default:
                System.out.println("maybe too hot.");
                break;
        }
    }

    public static void main(String [] args){ //这三个单词完全不知道什么意思
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.HOT), //这里没有break,转到默认的执行
                galapeno = new Burrito(Spiciness.MEDIUM);
        plain.describe();
        greenChile.describe();
        galapeno.describe();
    }

}
