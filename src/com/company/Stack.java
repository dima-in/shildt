package com.company;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack () { //конструктор
        tos = -1; //вершина стека
    }
    //разместить элемент в стеке
    void push (int item){
        if (item == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }
    //извлечь элемент из стека
    int pop () {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}
