14. Write a java program for calculator  using concept of multiple inheritance.

interface I1 {
int add (int a, int b);
int subtract (int a, int b);
}
interface I2 {
int multiply (int a, int b);
int divide (int a, int b);
}
class Calculator implements I1,I2 {
public int add (int a, int b) {
int c = a + b;
return c;
}
public int sub (int a, int b) {
int d = a - b;
return d;
}
public int mul (int a, int b) {
int m = a * b;
return m;
}
public int div (int a, int b) {
int j = a / b;
return j;
} 
public static void main (String[] args){
Calculator S = new Calculator ();
System.out.println ("add:"+S.add(10,4));
System.out.println ("sub"+S.sub(10,4));
System.out.println ("multiply:"+S.mul(10,4));
System.out.println ("divide:"+S.div(10,4));
       }
}
