package exercise;

import java.io.File;
import java.io.IOException;
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
    private static Point2D tempData;
    private static double[] tempOriginData;
    private static double[] tempUserData;

    public static void main(String [] args){

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
            //System.out.println(tempOriginData[i]);
            list.get(i).setOriginPoint(tempOriginData[i]);
        }

        for (int i = 0; i < tempUserData.length; i ++){
            //System.out.println(tempUserData[i]);
            list.get(i).setUserPoint(tempUserData[i]);
        }

        for (int i = 0; i < list.size(); i ++){
            System.out.print(list.get(i).getmName() + " ");
            System.out.print(list.get(i).getmX() + " ");
            System.out.print(list.get(i).getmY() + " ");
            System.out.print(list.get(i).getOriginPoint() + " ");
            System.out.println(list.get(i).getUserPoint() + " ");
            System.out.println();
        }

        writeToFile(list);

    }

    /**
     * calculate value to user point(x,y)
     */
    private static void getToUserLength(){
        tempUserData = new double[5];
        Point2D point2D;
        for (int i = 0; i < list.size(); i ++){
            point2D = tempData;
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
        tempData = new Point2D();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input X : ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input y : ");
        double y = Double.parseDouble(scanner.nextLine());
        tempData.setPos(x, y);
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
     * @param list	 ArrayList of Point2D entries.
     */
    public static void writeToFile(ArrayList<Point2D> list){
        PrintWriter printWriter = null;
        try {
            File file = new File("D:testWrite.csv");
            if (!file.exists()){
                file.createNewFile();
            }

            printWriter = new PrintWriter(file);
            for (int i = 0; i < list.size(); i ++){
                String str = list.get(i).getmName() + ";"
                        + list.get(i).getmX() + ";"
                        + list.get(i).getmY() + ";"
                        + list.get(i).getOriginPoint() + ";"
                        + list.get(i).getUserPoint() ;
                printWriter.println(str);
            }
            printWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (printWriter != null){
                printWriter.close();
            }
        }


    }


}
