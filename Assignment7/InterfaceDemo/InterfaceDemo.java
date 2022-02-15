package Assignment7.InterfaceDemo;

interface Interface1{
    public void method1();
    public void method2();
}
interface Interface2{
    public void method3();
    public void method4();
}
interface Interface3{
    public void method5();
    public void method6();
}
interface Interface4 extends Interface1,Interface2,Interface3{
    public void method7();
}
class Class1{
    public void method8(){
        System.out.println("this is method 8 in class 1");
    }
}
class Class2 extends Class1 implements Interface1, Interface2, Interface3, Interface4{

    @Override
    public void method1() {
        System.out.println("this is method1 from interface1");
    }

    @Override
    public void method2() {
        System.out.println("this is method2 from interface1");
    }

    @Override
    public void method3() {
        System.out.println("this is method3 from interface2");
    }

    @Override
    public void method4() {
        System.out.println("this is method4 from interface2");
    }

    @Override
    public void method5() {
        System.out.println("this is method5 from interface3");
    }

    @Override
    public void method6() {
        System.out.println("this is method6 from interface3");
    }

    @Override
    public void method7() {
        System.out.println("this is method7 from interface4");
    }
}


public class InterfaceDemo {
    public static void main(String args[]){
        Interface1 interface1=new Class2();
        interface1.method1();
        interface1.method2();

        Interface2 interface2=new Class2();
        interface2.method3();
        interface2.method4();

        Interface3 interface3=new Class2();
        interface3.method5();
        interface3.method6();

        Interface4 interface4= new Class2();
        interface4.method1();
        interface4.method2();
        interface4.method3();
        interface4.method4();
        interface4.method5();
        interface4.method6();
        interface4.method7();

        Class1 class1=new Class2();
        class1.method8();
    }
}
