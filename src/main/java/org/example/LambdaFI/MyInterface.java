package org.example.LambdaFI;

@FunctionalInterface
public interface MyInterface {
   // public void sayHello();

    // public void sum(int input);

    public void subtract(int x,int y);
    default void sayBye(){
    }

    public static void sayOk(){

    }
}
