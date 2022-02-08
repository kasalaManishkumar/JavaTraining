package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectStrings {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> first=new ArrayList<>();
        ArrayList<String> last=new ArrayList<>();
        String firstName;
        String lastName;
        String fullName;
        int indexOfSpace;
        for(int i=0;i<3;i++) {
            System.out.println("please enter your full name "+i);
            fullName = scanner.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName=fullName.substring(0,indexOfSpace);
            lastName=fullName.substring(indexOfSpace+1);
            first.add(firstName);
            last.add(lastName);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(first.get(i)+" ");
                System.out.println(last.get(j)+" ");
            }
        }

    }
}
