package array;

import java.util.Scanner;

public class Project {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int []someValues=new int[5];
        for(int i=0;i<someValues.length;i++){
            someValues[i]=scanner.nextInt();
        }
        for(int i=0;i<someValues.length;i++){
            System.out.println(2*someValues[i]+" ");
        }
    }
}
