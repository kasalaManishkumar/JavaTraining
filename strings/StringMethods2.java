package strings;

public class StringMethods2 {
    public static void main(String args[]){
        String name="James Son";
        String upper=name.toUpperCase();
        String lower=name.toLowerCase();
        int whereIsS=name.indexOf('S');
        String lastName=name.substring(5);
        System.out.println("the upper is "+upper);
        System.out.println("the lower is "+lower);
        System.out.println("the name is "+name);
        System.out.println("the last name is "+lastName);
        System.out.println("the letter s lie at starting index of "+whereIsS);
    }
}
