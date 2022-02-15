package Assigment5;

public class Singleton {
    static String var;// var should be static then it can be acessed by static function
    static void method(String word){
        var=word;
    }
    public void print(){
        System.out.println(var);// this method prints hello as a output
    }
}

