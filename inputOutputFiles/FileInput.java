package inputOutputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput {
    public static void main(String args[]){
        Scanner infile;
        try{
            infile=new Scanner(new File("src/Input.txt"));
            int input;
            int sum=0;
            while(infile.hasNext()){
                input=infile.nextInt();
                sum=sum+input;
                System.out.println(input);
            }
            System.out.println("the total sum is "+sum);
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("file canot be found");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException ie){
            System.out.println("error in reading");
            System.out.println(ie.getMessage());
        }
    }
}
