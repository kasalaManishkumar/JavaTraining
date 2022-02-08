package array;

import java.util.ArrayList;

public class List1 {
    public static void main(String args[]){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("john");
        arrayList.add("micheal");
        arrayList.add("ram");
        arrayList.add("sham");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
