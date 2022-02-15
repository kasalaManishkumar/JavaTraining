package Assigment6.Vampire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vampire{
    public static void main(String[] args) {
        test(10,1000);
    }

    static void test(int  startValue,  int  stopValue) {
        int countofRes = 0;
        StringBuilder res = new StringBuilder();
        for (int i = startValue; i <= stopValue; i++) {
            for (int j = i; j <= stopValue; j++) {
                if (isVampireNumber(i, j,true)) {
                    if(countofRes==100){
                        break;
                    }
                    countofRes++;
                    res.append("" + countofRes + ": = ( " + i + "," + j + " = " + i*j + ")" + "\n");
                }
            }
            if(countofRes==100){
                break;
            }
        }
        System.out.println(res);
    }




    static boolean isVampireNumber(int a, int b, boolean noPseudoVamireNumbers ) {
        if (noPseudoVamireNumbers) {
            if (a * 10 <= b || b * 10 <= a) {
                return false;
            }
        }
        String mulDigits = splitIntoDigits(a*b,0);
        String faktorDigits = splitIntoDigits(a,b);

        return mulDigits.equals(faktorDigits);
    }



    // methode to Split the numbers to Digits
    static String splitIntoDigits(int num, int num2) {

        StringBuilder res = new StringBuilder();
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num%10);
            num /= 10;
        }
        while (num2 > 0) {
            digits.add(num2%10);
            num2/= 10;
        }
        Collections.sort(digits);
        for (int i : digits) {
            res.append(i);
        }
        return res.toString();
    }
}
