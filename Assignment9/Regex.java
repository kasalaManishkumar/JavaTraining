package Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(Pattern.compile("^[A-Z].*[.]$").matcher(name).find() );
    }
}
