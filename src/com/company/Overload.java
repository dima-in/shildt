package com.company;

public class Overload{
    void test(){
        int r = 5;
        int g = 8;
        int u = r / g * 600 + 677;
        System.out.println("Параметры отсутвуют" + u);
    }

    void test(int a, int b){
        System.out.println("a и b:"+ a + " " + b);
    }
    double test(double a){
        System.out.println("Внутренние преобразование типов при вызове test(double a): " + a);
        return a;

    }

}
