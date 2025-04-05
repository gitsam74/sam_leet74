11. Write a java program to find out area of circle, square and triangle using method overloading.

package test;
import java.util.Scanner;

public class overloading {
Static int area (int S) {
return S*S;
}
Static double area (double r) {
return (22*r*r)/7;
}
Static double area (double h, double b) {
return (b*h)/2
}
public static void main (String[] args) {
Scanner ab = new Scanner (System.in);
System.out.println ("Enter side"); 
int S = ab.nextInt();
System.out.println ("Enter the radius");
double r = ab.nextDouble();
System.out.println ("Enter the height");
double h = ab.nextDouble ();
System.out.println ("Enter the breadth");
double b = ab.nextDouble ();

System.out.println ("The area of square is:"+area(s));
System.out.println ("The area of circle is:"+area(r));
System.out.println ("The area of triangle is:"+area(b,h));
      }
}