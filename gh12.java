12. Write a java program for calculator using the concept of interface.

interface ICalculator {
int add (int a, int b);
int sub (int a, int b);
int mul (int a, int b);
 int div (int a, int b);
}
class calculator implements ICalculator {
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
int p = a / b;
return p;
}
public static void main (String[] args){
Calculator R = new Calculator ();
int result1 = R.add (10,25);
int result2 = R.sub (10,25);
int result3 = R.mul (10,25);
int result4 = R.div (10,25);
System.out.println (result1);
System.out.println (result2);
System.out.println (result3);
System.out.println (result4);
}

