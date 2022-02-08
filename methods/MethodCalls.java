package methods;

public class MethodCalls {
    public static void main(String args[]){
        doSomeThing();
    }
    public static int getSomeValue(){
        return 150;
    }
    public static void doSomeThing(){
        int result=getSomeValue();
        System.out.println("In doSOmething");
        System.out.println("the value is "+result);
    }
}
