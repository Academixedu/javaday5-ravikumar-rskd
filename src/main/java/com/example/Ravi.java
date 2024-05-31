package com.example;
/**
 * Ravi
 */
public class Ravi {

    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=10;
        c=add(a,b);
        String name="Ravi";
        greetMethod(name);
        System.out.println("Value of C is "+ c);
    }
    public static void greetMethod(String name){
        System.out.println("Hello.."+name);
    }
    public static int add(int a, int b){
        int sum= a+b;
        return sum;
    }
}