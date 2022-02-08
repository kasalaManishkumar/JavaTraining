package Oops;

public class RectangleDemo {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);
        System.out.println(Rectangle.getNumRectangle());
        Rectangle r3;
        System.out.println("After declaration of r3 "+Rectangle.getNumRectangle());
        r3=new Rectangle(5.0,4);
        System.out.println(Rectangle.getNumRectangle());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
        System.out.println(r1.perimeter());
        System.out.println(r2.perimeter());
        System.out.println(r3.perimeter());
    }
}
