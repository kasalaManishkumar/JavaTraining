package Assigment8;

public class VotingSystem {
    private String name;
    private String nationality;
    private int age;
    public VotingSystem(String name,int age,String nationality) throws UserDefineException {
        check(name,age,nationality);
        this.age=age;
        this.name=name;
        this.nationality=nationality;
    }
    public void check(String name,int age,String nationality)throws UserDefineException{
        if(name.length()<3){
            throw new UserDefineException("the name is invalid");
        }
        if(age<18){
            throw new UserDefineException("the age is invalid");
        }
        if(nationality.equalsIgnoreCase("Indian")){
            throw new UserDefineException("the nationality is invalid");
        }
    }
}
class UserDefineException extends Exception{
    String s;
    public UserDefineException(String s){
        this.s=s;
    }
    public String getMessage(){
        return this.s;
    }
    public String toString(){
        return this.s;
    }
}
