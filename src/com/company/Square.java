package com.company;

import java.util.Scanner;

public class Square {

    Scanner in = new Scanner(System.in);
    //int num = in.nextInt();


    int s;
    int e;
    boolean prime;
    int divider;
    int i;

    void wim() {
    for (i = 2; i < 10; i++) {
        prime = true;
        for (divider = 2; divider <= i / divider; divider++)
            if ((i % divider) == 0)
                prime = false;
        //else {
        //  prime = true;
        // System.out.println("Число   " + i + "  простое, делитель  " + divider + " целых   " + e);
        else prime = true;

        if (prime)
            System.out.println("Число   " + i + "  простое, делитель  " + divider + " целых   " + e);
    }
    }

}
