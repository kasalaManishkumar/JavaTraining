package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectList3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<3;i++){
            System.out.println("please enter the name");
            name=scanner.nextLine();
            names.add(name);
            System.out.println("please enter the age");
            age=scanner.nextInt();
            ages.add(age);
            scanner.nextLine();
        }
        for(int i=0;i<names.size();i++){
            System.out.println("the name is "+names.get(i)+" and his age is "+ages.get(i));
        }
    }
}
