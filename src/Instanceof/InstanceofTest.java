package Instanceof;

/**
 * Created by fengjw on 2017/9/21
 * Code Change The World!
 */

public class InstanceofTest {

    public static void main(String [] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();
        Domestic domestic = new Domestic() {
            @Override
            public void Type() {

            }
        };

        System.out.println("cat instanceof Animal is " + (cat instanceof Animal));
        System.out.println("dog instanceof Animal is " + (dog instanceof Animal));
        System.out.println("dog instanceof Domestic is " + (dog instanceof Domestic));
        System.out.println("animal instanceof Dog is " + (animal instanceof Dog));
        System.out.println("Domestic instanceof Dog is " + (domestic instanceof Dog));
        /*
        instanceof 的意思是子对象是否属于父对象，包括extends、implements;
        或者他是属于哪种类型的subtype 
        包括就是true,不包括就是false.
        反之则不成立.
         */
        //System.out.println("false instanceof true is " + (false instanceof tr));

    }
}
