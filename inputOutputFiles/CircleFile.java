package inputOutputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args){
        ArrayList<Circle> circles=new ArrayList<>();
        fillArrays(circles);
        printCircles(circles);
    }
    private static void fillArrays(ArrayList<Circle> circles){
        Scanner infile;
        try{
            infile= new Scanner(new File("src/CircleData.txt"));
            Circle temp;
            double radius;
            while (infile.hasNext()){
                radius=infile.nextDouble();
                temp=new Circle(radius);
                circles.add(temp);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Cannot find the file");
            System.out.println(ex.getMessage());
        }
    }
    private static void printCircles(ArrayList<Circle> circles){
        PrintWriter pw;
        try{
            pw=new PrintWriter("src/CircleResult.txt");
            for(Circle circle:circles){
            System.out.println("Area "+circle.area());
            System.out.println("Circumference "+circle.circumference());
            System.out.println("radius "+circle.getRadius());
            System.out.println();
                pw.println("Area "+circle.area());
                pw.println("Circumference "+circle.circumference());
                pw.println("radius "+circle.getRadius());
                pw.println();
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("cannot find the file");
            System.out.println(ex.getMessage());
        }
    }
}
