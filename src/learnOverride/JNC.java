package learnOverride;

/**
 * Created by fengjw on 2017/9/7
 * Code Change The World!
 */

public class JNC extends Wine {

    private String name;

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
        return super.drink();
    }

    @Override
    public String toString() {
        return "Wine : " + getName();
    }

    public JNC() {
        setName("JNC");
    }
}
