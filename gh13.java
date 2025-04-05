13. Write a java program for calculator using concept of abstract.

import java.util.scanner;
abstract class Operations {
abstract int add (int a, int b);
abstract int sub (int a, int b);
abstract int mul (int a, int b);
abstract int div (int a, int b);
}
class Calculator extends Operations {
int add (int a, int b) {
int c = a + b;
return c;
}
int sub (int a, int b) {
int d = a - b;
return d;
}
int mul (int a, int b) {
int m = a * b;
return m;
}
int div (int a, int b) {
int j = a / b;
return j;
}
class Calculator {
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
Calculator myCal = new Calculator ();
System.out.println ("Enter two numbers:");
int a = sc.nextInt ();
int b = sc.nextInt ();
System.out.println ("addition:"+myCal.add(a,b));
System.out.println ("subtraction"+myCal.sub(a,b));
System.out.println ("multiplication:"+myCal.mul(a,b));
System.out.println ("division:"+myCal.div(a,b));
       }
}
