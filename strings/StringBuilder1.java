package strings;

public class StringBuilder1 {
    public static void main(String args[]){
        StringBuilder stringBuilder=new StringBuilder("James");
        stringBuilder.append(" is awesome");
        stringBuilder.insert(5, "john");
        System.out.println(stringBuilder);
        stringBuilder.replace(13,21,"amazing");
        System.out.println(stringBuilder);
        stringBuilder.replace(0,5,"Dr.");
        System.out.println(stringBuilder);

    }
}
