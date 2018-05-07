package Transient;

import java.io.Serializable;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class User implements Serializable{

    private static final long serialVersionUID = 8294180014912103005L;

    public  String name;
    private transient String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
