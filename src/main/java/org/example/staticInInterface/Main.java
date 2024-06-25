package org.example.staticInInterface;

interface A {
    static void sayHello(){
        System.out.println("Hello!");
    }
    default void sayBye(){
        System.out.println("say Bye");
    }
}
public class Main implements A{
    public static void sayHello(){
        System.out.println("main sayhello");
    }
    public static void main(String[] args) {
        A.sayHello();
        Main obj = new Main();
        obj.sayBye();
        obj.sayHello();

    }
}
