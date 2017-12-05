package exercise;

/**
 * Created by fengjw on 2017/12/5
 * Code Change The World!
 */

public class Point2D {

    private String mName = null;
    private double mX;
    private double mY;

    public Point2D(){

    }

    public Point2D(double x, double y){
        mX = x;
        mY = y;
    }

    public Point2D(String name, double x, double y){
        mName = name;
        mX = x;
        mY = y;
    }

    public void printInformation(){

    }

    public void setPos(double x, double y){

    }

    public void calculateLength(){

    }

    public void distanceTo(Point2D point2D){

    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getmX() {
        return mX;
    }

    public void setmX(double mX) {
        this.mX = mX;
    }

    public double getmY() {
        return mY;
    }

    public void setmY(double mY) {
        this.mY = mY;
    }
}
