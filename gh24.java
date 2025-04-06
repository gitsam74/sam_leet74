24. Write a java program using multithreading concept for extending a single class multiple thread.

class myThread1 extends Thread {
public void run () {
System.out.println ("task 1");
      }
}
public class MultiThread {
public static void main (String[] args){
MyThread1 t1 = new MyThread1 ();
MyThread1 t2 = new MyThread1 ();
t1.start();
t2.start();
System.out.println ("task 2");
     }
}