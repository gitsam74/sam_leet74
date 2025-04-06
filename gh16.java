16. Write a java program using exceptional handling for arithmatic exception using try catch block.

import java.io.IOException;
public class Exception {
public static void main (String[] args){

int numerator = 10;
int denominator = 0;
System.out.println (numerator);
System.out.println (denominator);
try {
int result = numerator/denominator;
System.out.println ("result"+result);
     }
catch (IO Exception) {
System.out.println ("error occurred");
}