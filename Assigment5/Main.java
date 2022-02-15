package Assigment5;

import static Assigment5.Singleton.method;

public class Main {
    public static void main(String args[]){
        DefaultInitialization defaultInitialization=new DefaultInitialization();
        defaultInitialization.method1();
        defaultInitialization.method();//if i print class variables it shows identifier expected
        Singleton singleton=new Singleton();// if i print method variables it shows variables not initialized
        method("hello");//if i initalize nonstatic tp static string it shows make it static
        singleton.print();//after making the class variable static then it prints the content
    }
}
