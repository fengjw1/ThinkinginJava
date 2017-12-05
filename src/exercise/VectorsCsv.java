package exercise;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fengjw on 2017/12/5
 * Code Change The World!
 */

public class VectorsCsv {

    private static Scanner stream;
    private static ArrayList<Point2D> list;
    private static ArrayList<Point2D> tempData;
    private static double[] tempOriginData;
    private static double[] tempUserData;

    public static void main(String [] args){

        ArrayList<Point2D> vectors = new ArrayList<Point2D>();

        try {
            File file = new File("D:test.csv");
            stream = new Scanner(file);
            list = new ArrayList<>();
        }catch (Exception e){
            e.printStackTrace();
        }

        readFromFile(stream, list);
        inputPoint2D();

        for (int i = 0; i < tempOriginData.length; i ++){
            System.out.println(tempOriginData[i]);
        }

        for (int i = 0; i < tempUserData.length; i ++){
            System.out.println(tempUserData[i]);
        }
    }

    /**
     * calculate value to user point(x,y)
     */
    private static void getToUserLength(){
        tempUserData = new double[5];
        Point2D point2D;
        for (int i = 0; i < list.size(); i ++){
            point2D = tempData.get(i);
            tempUserData[i] = list.get(i).distanceTo(point2D);
        }
    }

    /**
     * calculate value to origin
     */
    private static void getCalculateLength(){
        tempOriginData = new double[5];
        for (int i = 0; i < list.size(); i ++){
            tempOriginData[i] = list.get(i).calculateLength();
        }
    }

    /**
     * input name,x,y
     */
    private static void inputPoint2D(){
        tempData = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            Point2D point2D = new Point2D();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input Name : ");
            String name = scanner.nextLine();
            System.out.println("Please input X : ");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input y : ");
            double y = Double.parseDouble(scanner.nextLine());
            point2D.setmName(name);
            point2D.setPos(x, y);
            tempData.add(point2D);
        }
        getToUserLength();
        getCalculateLength();
    }

    /**
     * @brief Reads from `stream` and adds entries to `list`.
     *
     * @param stream Scanner providing read access to file.
     * @param list   ArrayList to store Point2D entries.
     */
    public static void readFromFile(Scanner stream, ArrayList<Point2D> list){
        try {
            stream.useDelimiter("\r");
            while (stream.hasNextLine()){
                String str = stream.next();
                //System.out.println(str);
                String [] strings = str.split(";");
                Point2D point2D = new Point2D();
                point2D.setmName(strings[0]);
                point2D.setmX(Double.parseDouble(strings[1]));
                point2D.setmY(Double.parseDouble(strings[2]));
                list.add(point2D);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @brief Writes entries of `list` to `stream`.
     *
     * @param stream PrintWriter providing write access to file.
     * @param list	 ArrayList of Point2D entries.
     * @param other  Reference Point2D object.
     */
    public static void writeToFile(PrintWriter stream, ArrayList<Point2D> list, Point2D other){

    }


}
