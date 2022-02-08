package looping;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int guess=random.nextInt(99)+1;
        System.out.println("Enter the number you guess between 1-100");
        int number=scanner.nextInt();
        int count=1;
        while(number!=guess){
            if(number<guess){
                System.out.println("you guessed it too low");
                count++;
            }
            if(number>guess){
                System.out.println("you guessed it too high");
                count++;
            }
            System.out.println("Enter the number you guess between 1-100");
            number=scanner.nextInt();
        }
        System.out.println("Congo you guess is correct in "+count+" guesses");
    }
}
