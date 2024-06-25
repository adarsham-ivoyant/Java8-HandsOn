package org.example.DefaultMethods.Pro1;

public interface Parent {
    default void sayHello(){
        System.out.println("Hello, Default method");
    }
}

