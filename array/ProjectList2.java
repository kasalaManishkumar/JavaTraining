package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectList2{
    public static  void  main(String args[]){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("please enter the input more than 0 and -1 to exit");
        int input=scanner.nextInt();
        while(input!=-1){
            arrayList.add(input);
            System.out.println("please enter the input more than 0 and -1 to exit");
            input=scanner.nextInt();
        }
        for(Integer array:arrayList){
            System.out.println(array+" ");
        }

    }
}
