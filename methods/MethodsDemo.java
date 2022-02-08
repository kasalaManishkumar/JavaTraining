package methods;

public class MethodsDemo {
    public static void main(String args[]){
        MethodsDemo methodsDemo=new MethodsDemo();
        int result=methodsDemo.addThese(10,20);
        System.out.println(result);
        System.out.println(getMe10());
        methodsDemo.hello();
        methodsDemo.number(15);
        System.out.println(square(90));
    }
    public void hello(){
        System.out.println("hey hi");
    }
    public void number(int a){
        System.out.println("the number is a: "+a);
    }
    public static int getMe10(){
        return 10;
    }
    public static double square(int a){
        return a*a;
    }
    public int addThese(int a,int b){
        return a+b;
    }
}
