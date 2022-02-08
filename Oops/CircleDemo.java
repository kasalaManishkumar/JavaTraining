package Oops;

public class CircleDemo {
    public static void main(String[] args){
    Circle unitCircle=new Circle();
    Circle myCircle=new Circle(12.5);
    Circle yourCircle=new Circle(10);
    printCircleData(unitCircle);
    printCircleData(myCircle);
    printCircleData(yourCircle);
    }
    public static void printCircleData(Circle circle){
        System.out.println("r"+circle.getRadius());
        System.out.println("c"+String.format("%.2f",circle.circumference()));
        System.out.println("a"+circle.area());
        System.out.println();
    }
}
