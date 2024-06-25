package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePro {
    public static void main(String[] args) {
        Predicate<Integer> salary = (x) -> x >100000;
        System.out.println(salary.test(10000000));

        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = mylist.stream().filter(n->n%2==0).mapToInt(n->n).sum();
        System.out.println(sum);


    }
}
