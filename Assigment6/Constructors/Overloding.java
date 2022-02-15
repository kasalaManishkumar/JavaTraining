package Assigment6.Constructors;

public class Overloding {
    private int num1;
    private int num2;
    public Overloding(){
        this(2,2);
    }
    public Overloding(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void print(){
        System.out.println(num1+" "+num2);
    }
}
class Main{
    public static void main(String args[]){
        Overloding overloding1=new Overloding();
        Overloding overloding2=new Overloding(5,10);
        overloding1.print();
        overloding2.print();
    }
}

