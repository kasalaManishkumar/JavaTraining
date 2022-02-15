package Assigment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.time.*;
public class CustomerKyc {
    public static void evaluate(String date1,String date2) throws ParseException {
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate=LocalDate.parse(date1,df);
        LocalDate currentDate=LocalDate.parse(date2,df);
        LocalDate currentAnniversery=signUpDate;
        currentAnniversery=currentAnniversery.withYear(currentDate.getYear());
        LocalDate startDate=currentAnniversery.minusDays(30);
        LocalDate endDate=currentAnniversery.plusDays(30);
        if(endDate.isAfter(currentDate)){
            endDate=currentDate;
        }
        if(currentDate.getYear()<=signUpDate.getYear()){
            System.out.println("No Range");
        }
        else {

            System.out.println(startDate+" "+endDate);
        }
    }
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        sc.nextLine();
        while(input!=0){
            String signup=sc.next();
            String currentDate=sc.next();
            sc.nextLine();
            evaluate(signup,currentDate);
            input--;
        }
    }
}
