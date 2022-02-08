package looping;

import java.util.Scanner;

public class LoopingStatement {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter positive integers");
        System.out.println("Enter negative to exit");

        int input=scanner.nextInt();
        int sum=0;
        while(input>=0){
            sum=sum+input;
            System.out.println("Enter positive integers");
            System.out.println("Enter negative to exit");
            input=scanner.nextInt();

        }
        System.out.print("your total sum is: "+ sum);
    }
}
