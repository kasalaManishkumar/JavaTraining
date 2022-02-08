package strings;

public class StringMethods1 {
    public static void main(String args[]){
        String name="Ram";
        String name1="Ram";
        String name2="sham";

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

        if(name.equals(name1)){
            System.out.println("Names are equal");
        }
        else{
            System.out.println("Names are not equal");
        }
        if(name.compareTo(name2)>0){
            System.out.println(name +">"+ name2);
        }
        else{
            System.out.println(name+"<="+name2);
        }

    }
}
