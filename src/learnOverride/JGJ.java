package learnOverride;

/**
 * Created by fengjw on 2017/9/7
 * Code Change The World!
 */

public class JGJ extends Wine {

    private String name;

    public JGJ() {
        setName("JGJ");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String drink() {
        return "喝的是： " + getName();
    }

    @Override
    public String toString() {
        return "Wine : " + getName();
    }
}
