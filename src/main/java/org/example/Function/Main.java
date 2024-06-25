package org.example.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> function2 = s -> s.substring(0,3);
        Function<List<Student>,List<Student>> studentsWithVipAsPrefix =li->{
            List<Student> result = new ArrayList<>();
            for(Student s:li){
                if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };
        Student s1 = new Student(1,"vipul");
        Student s2 = new Student(2,"vipulav");
        Student s3 = new Student(3,"Adarsh");
        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filteredStudnets = studentsWithVipAsPrefix.apply(students);
        System.out.println(filteredStudnets);
    }
}
