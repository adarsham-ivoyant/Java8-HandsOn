package org.example.RefrenceOperator;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void print(String s){
        System.out.println(s);
    }

    public void demo(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice","Bob","charlie");
        //with static var
        list.forEach(MethodRef::print);

        //with out static var
        MethodRef obj = new MethodRef();
        list.forEach(obj::demo);
    }
}
