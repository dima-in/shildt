package com.company;

class Box {  // ничео не cоздано. Логический каркас, логическая конструкция
    private double wight;
    private double height;
    private double depht;// переменные объектов

    Box(Box ob){  // клон, передаем конструктору объект ob, который тут и создается
        wight = ob.wight;
        height = ob.height;
        depht = ob.depht;
    }

    Box(double wight, double height, double depht){    // конструктор!!!
        System.out.println("Конструктор!!");
        this.wight = wight;
        this.height = height;
        this.depht = depht;
    }
    Box(){  // конструктор при отсутствии размеров
        wight = -1;
        height = -1;
        depht = -1;
    }
    Box(double len){ //конструктор для куба
        wight = height = depht = len;
    }

    double volume()  { //метод!!!
    return wight * height * depht;
} //расчет и возврат объема
}
