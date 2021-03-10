package com.company;

import java.util.Scanner;

public class Main {//class BoxDemo

	public static void main(String[] args)
			throws java.io.IOException {


		double vol;

		System.out.println("Объем mybox1 равен " + mybox1.volume());
		System.out.println("Вес mybox1 равен "   + mybox1.weight);
		System.out.println("Объем mybox2 равен " + mybox2.volume());
		System.out.println("Вес mybox2 равен "   + mybox2.weight);
		System.out.println("Объем куба  "        + myqube.volume());
		System.out.println("Масса куба равна "   + myqube.weight);
		System.out.println("Объем клона "        + myclone.volume());
		System.out.println("Вес клона равен "    + myclone.weight);

		//----------------------------------------------------------------------------------------------

		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		for (int i=0;i<10;i++) mystack1.push(i);
		for (int i=10;i<20;i++) mystack2.push(i);

		System.out.println("Содержимое стека mystack1: ");
		for (int i=0;i<10;i++)
			System.out.println(mystack1.pop());
		System.out.println("Содержимое стека mystack2: ");
		for (int i=0;i<10;i++)
			System.out.println(mystack2.pop());

		//----------------------------------------------------------------------------------------------

		Square inch = new Square();
		inch.wim();

		//----------------------------------------------------------------------------------------------

		Overload ov = new Overload();
		int i = 88;
		ov.test();
		ov.test(3);
		ov.test(6, 7);
		ov.test(i);
		ov.test(4526.34671);
		ov.test();
		double d = ov.test(364.44);


		//----------------------------------------------------------------------------------------------
	ObjParam ob1 = new ObjParam(100,22);
	ObjParam ob2 = new ObjParam(100,22);
	ObjParam ob3 = new ObjParam(-1, -1);

	System.out.println("ob1 == ob2" + ob1.equals(ob2));
	System.out.println("ob1 == ob3" + ob1.equals(ob3));
		//----------------------------------------------------------------------------------------------


	PassArray.vaTest(1, 4, 7, 3, 8, 4, 34, 68, 35, 25);
	PassArray.vaTest(" Блеск ", 3, 5, 6, 4, 5);
	PassArray.vaTest(true, false, false, true, false, true);
		//----------------------------------------------------------------------------------------------




	}
}