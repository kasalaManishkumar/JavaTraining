package strings;

import java.util.Scanner;

public class NameParser {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        System.out.println("please enter your full name");
        fullName=scanner.nextLine();
        int indexOfSpace=fullName.indexOf(' ');
        firstName=fullName.substring(0,indexOfSpace);
        lastName=fullName.substring(indexOfSpace+1);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
    }
}
