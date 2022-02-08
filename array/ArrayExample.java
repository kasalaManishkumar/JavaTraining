package array;

public class ArrayExample {
    public static void main(String[] args){
        int array[]=new int[10];
        for(int count=0;count<array.length;count++){
            array[count]=count+1;
        }
        for(int arr:array){
            System.out.println(arr);
        }
    }
}
