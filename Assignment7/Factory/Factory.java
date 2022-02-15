package Assignment7.Factory;


public class Factory {
    public static void rideCycle(CycleFactory factory){
        Cycle1 c = (Cycle1) factory.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        rideCycle(new UniFactory());
        rideCycle(new BiFactory());
        rideCycle(new TriFactory());
    }
}
interface Cycle1{
    void ride();
}
interface CycleFactory{
    Cycle1 getCycle();
}

class Unicycle1 implements Cycle1{
    public void ride(){
        System.out.println("Riding Unicycle");
    }
}
class UniFactory implements CycleFactory{
    public Cycle1 getCycle(){
        return new Unicycle1();
    }
}

class Bicycle1 implements Cycle1{
    public void ride(){
        System.out.println("Riding Bicycle");
    }
}
class BiFactory implements CycleFactory{
    public Cycle1 getCycle(){
        return new Bicycle1();
    }
}

class Tricycle1 implements Cycle1{
    public void ride(){
        System.out.println("Riding Tricycle");
    }
}
class TriFactory implements CycleFactory{
    public Cycle1 getCycle(){
        return new Tricycle1();
    }
}


