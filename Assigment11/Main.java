package Assigment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Map<Character,Integer> count=new HashMap<>();
        Scanner infile;
        Integer increment;
        Character character;
        String string;
        try{
            infile=new Scanner(new File("src/Assigment11/Text1.txt"));
            PrintWriter pw=new PrintWriter("src/Assigment11/Output.txt");
            while(infile.hasNext()){
                string=infile.next();
                for(int i=0;i<string.length();i++){
                    if(!count.containsKey(string.charAt(i))){
                        count.put(string.charAt(i),1);
                    }
                    else{
                        increment=count.get(string.charAt(i));
                        increment++;
                        count.put(string.charAt(i),increment);
                    }
                }
            }
            for(Map.Entry<Character,Integer>input:count.entrySet())
            {pw.println(input.getKey()+ " " +input.getValue());}
            pw.close();
            infile.close();
        }
        catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
    }
}
