package looping;

import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int input=scanner.nextInt();
        System.out.print("the even numbers are: ");
        for(int i=1;i<input;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}
