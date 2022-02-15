package Assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80.0));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

//1 query
        students.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
        System.out.println();
//2 query
        students.stream().filter(e -> e.getYearOfEnrollment() > 2018).map(Student::getName).forEach(System.out::println);
        System.out.println();
//3 query
        students.stream().filter(student->student.getEngDepartment().equals("Computer Science") && student.getGender().equals("Male")).forEach(s -> System.out.println(s.getName()));
        System.out.println();
//4 query
        Map<String, Long> noOfMaleAndFemale= students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemale);
        System.out.println();
//5 query
         Map<String,Double> AvgnoOfMaleAndFemale= students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
         System.out.println(AvgnoOfMaleAndFemale);
         System.out.println();
//6 query
        Optional<Student> highestPercentage= students.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));
        Student highestPer = highestPercentage.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : "+highestPer.getId());
        System.out.println("Name : "+highestPer.getName());
        System.out.println("Age : "+highestPer.getAge());
        System.out.println("Gender : "+highestPer.getGender());
        System.out.println("Department : "+highestPer.getEngDepartment());
        System.out.println("Year Of Joining : "+highestPer.getYearOfEnrollment());
        System.out.println("Salary : "+highestPer.getPerTillDate());
        System.out.println();
//7 query
        Map<String, Long> CountByDepartment= students.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = CountByDepartment.entrySet();
        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();
//8 query
        Map<String, Double> avgPercentage= students.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
        Set<Map.Entry<String, Double>> entrySet1 = avgPercentage.entrySet();
        for (Map.Entry<String, Double> entry : entrySet1)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();
//9 query
        Optional<Student> youngestMaleStudent= students.stream().filter(e -> e.getGender()=="Male" && e.getEngDepartment()=="Electronic").min(Comparator.comparingInt(Student::getAge));
        Student youngestMaleStudent1 = youngestMaleStudent.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");
        System.out.println("----------------------------------------------");
        System.out.println("ID : "+youngestMaleStudent1.getId());
        System.out.println("Name : "+youngestMaleStudent1.getName());
        System.out.println("Age : "+youngestMaleStudent1.getAge());
        System.out.println("Year Of Joinging : "+youngestMaleStudent1.getYearOfEnrollment());
        System.out.println("Salary : "+youngestMaleStudent1.getPerTillDate());
        System.out.println();

        Map<String, Long> countMaleFemaleStudents= students.stream().filter(e -> e.getEngDepartment()=="Computer Science").collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(countMaleFemaleStudents);
    }
}
