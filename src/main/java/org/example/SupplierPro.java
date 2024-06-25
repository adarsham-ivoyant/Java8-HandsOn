package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierPro {
    public static void main(String[] args) {

        Supplier<Integer> sup = () -> 1;
        System.out.println(sup.get());

        //with all FI predicate and dunction, consumer and supplier
        Predicate<Integer> pre = i -> i%2==0;
        Function<Integer,Integer> func = x -> x*x;
        Consumer<Integer> con = x -> System.out.println(x);
        Supplier<Integer> sup2 = () -> 2;

        if(pre.test(sup2.get())){
            con.accept(func.apply(sup2.get()));
        }
    }

}
