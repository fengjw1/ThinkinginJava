package ObjectCopy;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class CopyTest {

    public static void main(String [] args) throws CloneNotSupportedException{

        //original object
        Student stud = new Student("John", "Algebra");
        System.out.println("Original Object : " + stud.getName() + " - " + stud.getSubj().getName());

        //copy object
        Student cloneStud = (Student) stud.clone();
        System.out.println("Cloned object : " + cloneStud.getName() + " - " + cloneStud.getSubj().getName());

        stud.setName("Dan");
        stud.getSubj().setName("Physics");
        System.out.println("Original object : " + stud.getName() + " - " + stud.getSubj().getName());
        System.out.println("Copy object : " + cloneStud.getName() + " - " + cloneStud.getSubj().getName());


    }



}
