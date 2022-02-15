package Assignment7.RodentsDemo;

class Rodent{
    public void eat(){
        System.out.println("the rodent is eating");
    }
    public void run(){
        System.out.println("the rodent can run");
    }
}
class Mouse extends Rodent{
    @Override
    public void eat() {
        System.out.println("the mouse is eating");
    }

    @Override
    public void run() {
        System.out.println("the mouse can run");
    }
}
class Gerbil extends Rodent{
    @Override
    public void eat() {
        System.out.println("the Gerbil can eat");
    }

    @Override
    public void run() {
        System.out.println("the Gerbil can run");
    }
}
class Hamster extends Rodent{
    @Override
    public void eat() {
        System.out.println("the Hamster can eat");
    }

    @Override
    public void run() {
        System.out.println("the Hamster can run");
    }
}
public class RodentsDemo {
    public static void main(String args[]){
    Rodent rodent[]=new Rodent[3];
    rodent[0]=new Mouse();
    rodent[1]=new Gerbil();
    rodent[2]=new Hamster();

    rodent[0].run();
    rodent[0].eat();

    rodent[1].eat();
    rodent[1].run();

    rodent[2].run();
    rodent[2].eat();
    }
}
