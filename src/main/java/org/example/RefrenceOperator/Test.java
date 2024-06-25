package org.example.RefrenceOperator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice","Bob","charlie");
        list.stream().map(x-> new ConstuRef(x)).collect(Collectors.toList()).
        forEach(System.out::println);

        System.out.println("after using constRef");
        //using constructor Ref
        list.stream().map(ConstuRef::new).collect(Collectors.toList()).
                forEach(System.out::println);
    }
}
