package com.basics1;

//Java program to illustrate error while 
//using class from different package with
//default modifier
import com.basics.*;

//This class is having default access modifier
class GeekNew {
	public static void main(String args[]) {
		// accessing class Geek from package com.basics
		PrivateGeek obj = new PrivateGeek();
		obj.display();
	}
}
