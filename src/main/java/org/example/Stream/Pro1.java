package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pro1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,6,2,8,7,9,4543,12,7,2,9,4,6,12,45,32,34,65,654,2345);

        //own logic
        list.stream().map(x -> x*x).forEach(System.out::println);

        //using filter and display that in list
        List<Integer> mylist = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("filter");
        System.out.println(mylist);


        //using map
        List<Integer> mylist1 = list.stream().filter(x->x%2==0).map(x->x/2).collect(Collectors.toList());
        System.out.println("using map");
        System.out.println(mylist1);



        //using Distict
        List<Integer> mylist2 = list.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
        System.out.println("using distinct");
        System.out.println(mylist2);

        //using max
        System.out.println("using max()");
        Integer maxValue= list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .max((a,b)->(a-b)).get();
        System.out.println("max value in list:"+maxValue);

        //using count
        System.out.println("using count()");
        Long listCount = list.stream()
                .count();
        System.out.println("List count is: "+listCount);

        //using sorted
        List<Integer> mylist3 = list.stream().
                filter(x->x%2==0).
                map(x->x/2).
                distinct().
                sorted().collect(Collectors.toList());

        System.out.println("using sorted");
        System.out.println(mylist3);

        //using sorted with desending in comparator
        List<Integer> mylist4 = list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());
        System.out.println("using sorted with desc in comparator interface");
        System.out.println(mylist4);

        //using limit()
        List<Integer> mylist5 = list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("using limit()");
        System.out.println(mylist5);

        //using skip()
        List<Integer> mylist6 = list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(5)
                .skip(1) //it will skip starting one ele
                .collect(Collectors.toList());

        System.out.println("using limit()");
        System.out.println(mylist6);

        //using iterate print upto 100
        List<Integer> mylist7 = Stream.iterate(0,x->x+10)
                .limit(20)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("using iterator");
        System.out.println(mylist7);

        //using peak
        List<Integer> mylist8 = list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted()
                .limit(5)
                .skip(1)
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());



        //using min
        System.out.println("using min()");
        Integer minValue= list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .min((a,b)->(b-a)).get();
        System.out.println("min value in list:"+minValue);

        //paralles Stream
        System.out.println("using paralles Stream");
        list.parallelStream().forEach(System.out::println);
    }
}
