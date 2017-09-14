package InnerClass;

/**
 * Created by fengjw on 2017/9/14
 * Code Change The World!
 */

public class Test {

    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String [] args){
        Test test = new Test();
        test.test(new Bird() {
            @Override
            public int fly() { //抽象方法必须被重写
                return 10000;
            }

            @Override
            public String getName() { //重写getName（）方法
                return "大鸟";
            }
        });
    }
}
