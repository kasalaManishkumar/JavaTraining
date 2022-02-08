package inputOutputFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String args[]){
        ArrayList<String> Names=new ArrayList<>();
        Names.add("Samantha");
        Names.add("Kyle");
        Names.add("John");
        try {
            PrintWriter pw = new PrintWriter("src/Names.txt");
            for(String name:Names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
        System.out.println("Cant find the file");
        System.out.println(ex.getMessage());
        }
    }
}
