package Assigment6.Constructors;

public class Constuctors {
    private String word;
    Constuctors(String word){
        this.word=word;
        System.out.println(this.word);
    }
    public static void main(String args[]) {
        Constuctors []constuctors;
        constuctors=new Constuctors[5];

        for (int i = 0; i < constuctors.length; i++) {
            System.out.println(constuctors[i]=new Constuctors("hello"));
        }
    }
}


