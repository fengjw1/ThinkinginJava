package learnInterface;

/**
 * Created by fengjw on 2017/9/6
 * Code Change The World!
 */

public class Apple implements Fruit {

    private int count;
    private String name;

    public Apple(int count, String name){
        this.count = count;
        this.name = name;
    }

    @Override
    public int getInt() {
        return count;
    }

    @Override
    public String getStr() {
        return name;
    }
}
