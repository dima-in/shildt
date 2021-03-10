package com.company;

public class ObjParam {
    int a, b;
    ObjParam(int i, int j){ //constructor
        System.out.print("!");
        a = i;
        b = j;
        System.out.println("i="+ i +"j="+ j +"a="+ a +"b="+ b);
    }
    boolean equalTo(ObjParam param){
        if (param.a == a && param.b == b) {
            System.out.println("param = " +param);
            System.out.println("a = " + a + "b = " + b);
            return true;
        }
        else return false;
    }
}
