package Oops;

public class HouseDemo {
    public  static void main(String args[]){
    House myHouse=new House();
    House yourHouse=new House();
    myHouse.setColor("red");
    myHouse.setNumStories(2);
    myHouse.setNumWindows(6);

    yourHouse.setNumStories(3);
    yourHouse.setNumWindows(10);
    yourHouse.setColor("white");
    System.out.println("the building color is "+myHouse.getColor()+" and the number of stores are "+myHouse.getNumStories()+" the number of windows "+myHouse.getNumWindows());
    System.out.println("the building color is "+yourHouse.getColor()+" and the number of stores are "+yourHouse.getNumStories()+" the number of windows "+yourHouse.getNumWindows());
    }
}
