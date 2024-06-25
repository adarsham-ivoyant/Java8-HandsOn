package org.example.LambdaFI.pro3;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPro {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(20);
        s.add(17);
        s.add(19);
        s.add(18);
        s.stream().forEach(System.out::println);

        Set<Integer> obj = new TreeSet<>((a,b)-> b - a );
        obj.add(20);
        obj.add(17);
        obj.add(19);
        obj.add(18);

        obj.stream().forEach(System.out::println);

    }
}
