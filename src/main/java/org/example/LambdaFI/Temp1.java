package org.example.LambdaFI;

public class Temp1  {
    public static void main(String[] args) {

    /**    MyInterface myInterface = ()-> System.out.println("hello world");
        MyInterface myInterface1 = () -> {
            System.out.println("Java8");
            System.out.println("functional Interface");
        };
        myInterface1.sayHello();
        myInterface.sayHello();**/

   /*** MyInterface myInterface3 = (input) -> System.out.println("Sum:"+ input);

    myInterface3.sum(10);***/

        MyInterface myInterface4 = (x,y)-> System.out.println(x-y);

        myInterface4.subtract(20,10);

    }
}
