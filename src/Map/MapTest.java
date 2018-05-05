package Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by fengjw on 2018/3/27
 * Code Change The World!
 */

public class MapTest {
    public static void main(String [] args){
        Day day1 = new Day(1,2,3);
        Day day2 = new Day(2,3,4);
        Map<String, Day> map = new HashMap<String, Day>();
        map.put("first", day1);
        map.put("second", day2);
        System.out.println(map.containsKey("first"));
        System.out.println(map.containsKey("second"));
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(map.get(key));
        }
        map.remove("first");
        System.out.println(map);
    }
}
