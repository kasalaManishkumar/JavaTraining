package inputOutputFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String args[]){
        try{
            PrintWriter pw=new PrintWriter("src/Output.txt");
            pw.println("Hello there");
            pw.println("my name is james dont play games");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't write to a file");
            System.out.println(ex.getMessage());
        }
    }
}
