package Enum;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */
//http://www.cnblogs.com/happyPawpaw/archive/2013/04/09/3009553.html
public class LightTest {
    //定义枚举类型
    public enum Light{
        //利用构造函数传参
        REB(1), GREEN(3), YELLOW(2);

        private int nCode;
        private Light(int nCode){
            this.nCode = nCode;
        }

        public String toString(){
            return String.valueOf(nCode);
        }

    }

    public static void main(String [] args){
        System.out.println("演示枚举类型的历遍...");
        testTraversalEnum();

        System.out.println("演示EnmuMap对象的使用和历遍...");
        testEnumMap();

        System.out.println("演示EnumSet对象的使用和历遍...");
        testEnumSet();

    }

    private static void testEnumSet(){
        EnumSet<Light> currEnumSet = EnumSet.allOf(Light.class);
        for (Light light : currEnumSet){
            System.out.println("当前EnumSet中的数据为 ：" + light);
        }
    }

    private static void testEnumMap(){
        EnumMap<Light, String> currEnumMap = new EnumMap<Light, String>(Light.class);
        currEnumMap.put(Light.REB, "红灯");
        currEnumMap.put(Light.YELLOW, "黄灯");
        currEnumMap.put(Light.GREEN, "绿灯");

        for (Light light : Light.values()){
            System.out.println("[key = " + light.name()
            + ", value = " + currEnumMap.get(light) + "]");
        }

    }

    private static void testTraversalEnum(){
        Light[] lights = Light.values();
        for (Light light : lights){
            System.out.println("当前灯name : " + light.name());
            System.out.println("当前灯ordinal : " + light.ordinal());
            System.out.println("当前灯 : " + light);
        }
    }

}
