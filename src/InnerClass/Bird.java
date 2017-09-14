package InnerClass;

/**
 * Created by fengjw on 2017/9/15
 * Code Change The World!
 */

public abstract class Bird {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract int fly();
}
