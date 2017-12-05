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

    public static void main(String [] args){

        try {
            File file = new File("D:test.csv");
            stream = new Scanner(file);
            list = new ArrayList<>();
        }catch (Exception e){
            e.printStackTrace();
        }

        readFromFile(stream, list);

        for (int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i).getmName());
            System.out.println(list.get(i).getmX());
            System.out.println(list.get(i).getmY());
        }
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
