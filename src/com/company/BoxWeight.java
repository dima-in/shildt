package com.company;

public class BoxWeight extends Box {
    double weight; // вес парралелепипеда
    BoxWeight(BoxWeight obb){
        super(obb);
        weight = obb.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); //вызов конструктора из суперкласса
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }


}
