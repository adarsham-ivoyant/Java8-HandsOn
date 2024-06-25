package org.example.Function;

import java.util.function.Function;

public class FunctionPro {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        System.out.println(func1.apply("AdarshaMV"));

        Function<String,String> func2 = ss -> ss.substring(0,3);

        System.out.println(func2.apply("Adarsh"));

        Function<String,String> temp = s -> s.toUpperCase();
        Function<String, String> temp1 = s-> s.substring(0,3);

        System.out.println(temp.andThen(temp1).apply("java"));


        Function<Integer,Integer> obj = x -> x * 2;
        Function<Integer,Integer> obj2 = x -> x * x* x;

        System.out.println(obj.andThen(obj2).apply(3));
        System.out.println(obj2.andThen(obj).apply(3));
    }
}
