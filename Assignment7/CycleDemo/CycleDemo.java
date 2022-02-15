package Assignment7.CycleDemo;
public class CycleDemo {
    public static void main(String[] args) {
         Cycle []cycles = new Cycle[3];
         cycles[0]=new Unicycle();//parent=new child childen are not accesable and casting is done implicitly
        Unicycle cycle=(Unicycle)cycles[0];//downcasting parent to child
        cycle.ride();
        cycle.wheels();
        cycle.balance();

        cycles[1]=new Bicycle();
        Bicycle cycle1=(Bicycle)cycles[1];
        cycle1.ride();
        cycle1.wheels();
        cycle1.balance();

        cycles[2]=new Tricycle();
        Tricycle cycle2=(Tricycle)cycles[2];//downcasting is done sothat the child and parnt methods can be accessed
        cycle2.ride();
        cycle2.wheels();
    }

}
class Cycle{
    void ride() {
        System.out.println("Cycle.ride()");
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Unicycle.ride()");
    }

    @Override
    int wheels() {
        return 1;
    }

    void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Bicycle.ride()");
    }

    @Override
    int wheels() {
        return 2;
    }

    void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Tricycle.ride()");
    }

    @Override
    int wheels() {
        return 3;
    }
}
