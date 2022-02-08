package methods;

import java.util.Random;

import static java.util.Random.*;

public class WIth2DArrays {
    public static void main(String args[]){
    int twoDArray[][]=new int[2][3];
    fill2dArrays(twoDArray);
    print2dArrays(twoDArray);
    mul2DArray(twoDArray);
    print2dArrays(twoDArray);
    }
    public static void fill2dArrays(int [][]ArrTwoD){
        Random random=new Random();
        for(int i=0;i<ArrTwoD.length;i++){
            for(int j=0;j<ArrTwoD[i].length;j++){
                ArrTwoD[i][j]= random.nextInt(100);
            }
        }
    }
    public static void print2dArrays(int [][]ArrTwoD){
    for(int arr[]:ArrTwoD){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    }
    public static void mul2DArray(int [][]ArrTwoD){
        for(int i=0;i<ArrTwoD.length;i++){
            for(int j=0;j<ArrTwoD[i].length;j++){
                ArrTwoD[i][j]*=2;
            }
        }
    }
}
