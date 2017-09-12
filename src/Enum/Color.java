package Enum;

/**
 * Created by fengjw on 2017/9/12
 * Code Change The World!
 */

public enum  Color {

    RED("红色", 1), GREEN("绿色", 2), YELLOW("黄色", 3), BLUE("蓝色", 4), BLANK("白色", 5);

    private String color;
    private int num;
    private Color(String color, int num){
        this.color = color;
        this.num = num;
    }

    public String getColorName(int num){
        String name = null;
        for (Color c : Color.values()){
            if (c.num == num){
                name = c.color;
            }else {
                name = "未找到匹配的";
            }
        }
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
