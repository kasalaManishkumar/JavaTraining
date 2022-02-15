package Assignment7.Innerclass;

class Outer{
    public class InnerClass{
     public InnerClass(String s){
         System.out.println("this is first inner class");
         s="hello";
     }
     public InnerClass(){

     }
    }
}
class Outer1 extends Outer{

    public class InnerClass1 extends Outer.InnerClass {
       public InnerClass1(){
           new Outer().super();
           System.out.println("this is second inner class calling super default");

        }
    }
}
public class Demo {
    public static void main(String args[]){
    Outer outer=new Outer();
    Outer.InnerClass innerClass=outer.new InnerClass("s");
    Outer1 outer1=new Outer1();
    Outer1.InnerClass1 innerClass1=outer1.new InnerClass1();
}}
