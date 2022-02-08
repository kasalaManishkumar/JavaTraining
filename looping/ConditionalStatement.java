package looping;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String args[]){
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        age=scanner.nextInt();
        if(age>18){
            System.out.println("Your able to vote");
        }
        else{
            System.out.println("your not able to vote");
        }
    }

}
