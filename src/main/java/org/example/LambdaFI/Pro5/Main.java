package org.example.LambdaFI.Pro5;

public class Main {
    public static void main(String[] args) {
        //Using anonymous inner class
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "1000";
            }
        };
        System.out.println(employee.getSalary());
        //using lambda Ex
        Employee e = ()-> {
            return "10";
        };
        System.out.println(e.getSalary());
    }
}
