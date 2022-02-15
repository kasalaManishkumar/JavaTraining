package Assigment8;

public class Main {
    public static void main(String args[]){
    try{
    VotingSystem votingSystem=new VotingSystem("Mani",16,"indian");
    }
    catch(UserDefineException userDefinedException){
        System.out.println(userDefinedException.getMessage());
    }
    finally {
        System.out.println("this block is executed for sure");
    }
    }
}

