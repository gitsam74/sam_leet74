18. Write a java program using exceptional handling using array index out of bound exception.

class ArrayIndexOutOfBoundException {
public static void main (String[] args){
String names = {"A","B","C"};

System.out.println (names[0]);
System.out.println (names[1]);
System.out.println (names[2]);
System.out.println (names[-1]);
         }
}