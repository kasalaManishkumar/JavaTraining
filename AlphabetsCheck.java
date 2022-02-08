package letters;

import java.util.Scanner;

public class AlphabetsCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string");
        String input=sc.next();
        boolean check=false;
        for(int i=0;i<input.length();i++){
            if(!(input.charAt(i)>='a' && input.charAt(i)<='z' ||input.charAt(i)>='A' && input.charAt(i)<='Z')) {
                check = true;
            }
        }
        if(check){
            System.out.println("It also contains other than a-z && A-Z");
        }
        else{
            System.out.println("all the alphabets are a-z && A-Z");
        }
    }
}
//TimeComplexcity O(n)
//SpaceComplexcity O(1)
