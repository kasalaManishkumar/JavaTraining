package inputOutputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String args[]){
        ArrayList<Rectangle> rectangleList=new ArrayList<>();

       fillArrayList(rectangleList);
       printArrayList(rectangleList);
    }
    public static void fillArrayList(ArrayList<Rectangle> al){
    Scanner infile;
    try{
        infile=new Scanner(new File("src/Rectangle_Data.txt"));
        Rectangle temp;
        double length;
        double width;
        while (infile.hasNext()){
            length=infile.nextDouble();
            width=infile.nextDouble();
            temp=new Rectangle(length,width);
            al.add(temp);

        }
        infile.close();
    }
    catch(FileNotFoundException ex){
    System.out.println("Cannot find the file");
    }
    }
    public static void printArrayList(ArrayList<Rectangle> al){
        for(Rectangle r:al){
            System.out.println("length "+r.getLength());
            System.out.println("width "+r.getWidth());
            System.out.println("Area "+String.format("%.2f",r.area()));
            System.out.println("Perimeter "+r.perimeter());
            System.out.println();
        }
    }
}
