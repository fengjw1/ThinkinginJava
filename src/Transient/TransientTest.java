package Transient;

import java.io.*;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class TransientTest {

    public static void main(String [] args){
//        User user = new User();
//        user.setName("fengjw");
//        user.setPassword("123456");
//
//        try {
//            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./User.txt"));
//            os.writeObject(user);
//            os.flush();
//            os.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try {
//            User.name = "xx";//read memory variable
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./User.txt"));
            User user = (User) is.readObject();
            is.close();
            System.out.println("Name : " + user.getName());
            System.out.println("Password : " + user.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
