package exercise;

import java.text.DecimalFormat;

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
        setmX(x);
        setmY(y);
    }

    public double calculateLength(){
        DecimalFormat df = new DecimalFormat("#.##");
        double result = Double.parseDouble(df.format(Math.sqrt(mX * mX + mY * mY)));
        return result;
    }


    public double distanceTo(Point2D point2D){
        DecimalFormat df = new DecimalFormat("#.##");
        double userX = point2D.getmX();
        double userY = point2D.getmY();
        double lengthX = Math.abs(userX - mX);
        double lengthY = Math.abs(userY - mY);
        double result = Double.parseDouble(df.format(Math.sqrt(lengthX * lengthX + lengthY * lengthY)));
        return result;
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
