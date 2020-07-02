package com.kodilla;

public class Kalkulator {
    int a;
    int b;

    public int additionMethod(int a, int b) {
        return a+b;
    }
    public int subtractionMethod(int a, int b) {
        return a-b;
    }

    public static void main(String args []) {
        Kalkulator calculator = new Kalkulator();
        System.out.println(calculator.additionMethod(5,6));
        System.out.println(calculator.subtractionMethod(10,2));
    }
}
