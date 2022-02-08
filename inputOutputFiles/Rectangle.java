package inputOutputFiles;

public class Rectangle {
    private double length;
    private double width;
    private static int numRectangle;
    Rectangle(){
        this(1.0,1.0);
    }
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        numRectangle++;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    }

    public static int getNumRectangle() {
        return numRectangle;
    }
    public double perimeter(){
        return 2*length+2*width;
    }

}
