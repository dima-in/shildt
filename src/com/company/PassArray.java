package com.company;

public class PassArray {
    static void vaTest(int ... v) {  //метод принимает аргументы переменной длинны
        System.out.print("vaTest(int ...  v): " + "Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v) // из коллоекции v извлекаются все элементы с первого до ппоследнего и присваиваются x
            System.out.print(" " + x);
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ... v): " + "Количество аргументов: " + v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(" " + x);
        System.out.println();
    }
    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String msg , int...v " + "Количество аргументов: " + v.length + " Содержимое: ");
        for (int x:v)
            System.out.print(" " + x);
        System.out.println();
    }
}
