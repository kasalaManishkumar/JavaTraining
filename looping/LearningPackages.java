package looping;

import java.util.Scanner;

public class LearningPackages {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;
        System.out.println("Which package do you want? 1,2, or 3?");
        packageNumber=scanner.nextInt();

        System.out.println("How many courses you enrolled in this month");
        howManyCourses=scanner.nextInt();

        if(packageNumber==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNumber==2){
                baseCost=12;
                costPerCourse=4;
                numIncluded=4;
        }
        else{
                baseCost=15;
                costPerCourse=3;
                numIncluded=6;
        }
        if(howManyCourses>numIncluded){
            totalCost=baseCost+(howManyCourses-numIncluded)*costPerCourse;
        }
        else{
            totalCost=baseCost;
        }
        System.out.println("the total cost is: "+totalCost);
    }
}
