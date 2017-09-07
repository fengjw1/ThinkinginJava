package learnOverride;

/**
 * Created by fengjw on 2017/9/7
 * Code Change The World!
 */

public class Test {
    public static void main(String [] args){
        Wine[] wines = new Wine[2];
        JNC jnc = new JNC();
        JGJ jgj = new JGJ();

        wines[0] = jnc;
        wines[1] = jgj;
        for (int i = 0; i < 2; i ++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
            //这里本来都应该是执行父类 的方法，但是子类重写了，所以执行的是子类的。
            //如果子类有而父类没有，则无法执行子类的方法。
            //向上转型是无法获取子类有父类没有的方法的。
        }
    }
}
