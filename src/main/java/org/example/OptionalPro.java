package org.example;

import java.util.Optional;

public class OptionalPro {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        name.ifPresent(System.out::println);

        //2nd static method
        Optional<String> name1 = getName2(2);
        String nameToBeUsed = name1.orElse("NA");
        System.out.println(nameToBeUsed);

    }

    private static Optional<String> getName(int id){
        String name = null;
        return Optional.ofNullable(name);//if we have data we can go with optional.of("Ram")
    }

    private static Optional<String> getName2(int id){
        return Optional.empty();
    }
}
