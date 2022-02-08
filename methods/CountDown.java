package methods;

public class CountDown {
    public static void main(String args[]){
    countDown(10);
    countDown(30,20);
    }
    public static void countDown(int a){
        if(a>=0){
            System.out.println(a);
            countDown(a-1);
        }
    }
    public static void countDown(int a,int b){
        if(a>=b){
            System.out.println(a);
            countDown(a-1,b);
        }
    }
}
