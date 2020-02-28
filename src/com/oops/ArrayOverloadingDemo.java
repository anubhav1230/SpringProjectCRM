package com.oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Animals{}

class Monkey{
	
	
}

public class ArrayOverloadingDemo {

	void m1 (Float a) {
		
		System.out.println("yahoo ArrayList");
	}
	

	void m1 (double a) {
		
		System.out.println("yahoo linkedList");
	}
	
	
	public static void main(String args[]) {
		
		ArrayOverloadingDemo array = new ArrayOverloadingDemo();
		
//		List<Animals> theList = new ArrayList();
		array.m1(203);
		
	}
}
