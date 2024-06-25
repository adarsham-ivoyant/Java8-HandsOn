package org.example.LambdaFI.pro3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(17);
        mylist.add(14);
        mylist.add(16);
        mylist.add(18);
        mylist.add(15);

       // Collections.sort(mylist,new Myclass1());
        Collections.sort(mylist, (a,b)-> a-b);//above line we used comparator but here also we used comparator with lambda
        System.out.println(mylist);


    }
}
