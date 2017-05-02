package com.basics1;

import com.basics.*;
//Java program for calling a method of one class in different package
public class TestAccessMethod {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.foo();
	}
}
