package org.example.LambdaFI.Pro4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    public Integer id;
    public String name;

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id+" "+this.name;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student( 2,"Vipul");
        Student s2 = new Student(3,"Raj");
        Student s3 = new Student(1,"Akshith");

        List<Student> l1 = new ArrayList<Student>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        Collections.sort(l1, (a,b) -> b.id-a.id);
        System.out.println(l1);

    }
}
