package org.example.DefaultMethods.Pro2;

interface A{
    default void sayHello(){
        System.out.println("A Says Hello");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B Says Hello");
    }
}
public class Main implements A,B{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.sayHello();
    }

    @Override
    public void sayHello() {
        B.super.sayHello();
    }
}
