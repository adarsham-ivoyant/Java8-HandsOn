package org.example.LambdaFI.pro2;

public class Main {
    public static void main(String[] args) {
        Employee obj = () -> "Software";
        System.out.println(obj.getName());

        Employee obj2 = () -> "Tester";
        System.out.println(obj2.getName());
    }
}
