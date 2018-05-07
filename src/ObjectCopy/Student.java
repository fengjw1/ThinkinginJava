package ObjectCopy;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class Student implements Cloneable {

    //Object quote
    private Subject subj;

    private String name;

    public Student(String s, String sub){
        name = s;
        subj = new Subject(sub);
    }

    public Subject getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
