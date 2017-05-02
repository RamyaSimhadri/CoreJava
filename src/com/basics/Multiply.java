package com.basics;

//Interface
interface Multiply{
 //abstract methods
 public abstract int multiplyTwo(int n1, int n2);
 /* We need not to mention public and abstract
  * as all the methods in interface are 
  * public and abstract by default
  */
 int multiplyThree(int n1, int n2, int n3);

 /*Regular methods are not allowed 
  * in an interface. 
  */
}