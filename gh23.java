23. Write a java program using multithreading concept for extending a thread class / single task by single thread.

class myThread extends Thread {
public void run () {
System.out.println ("task 1");
      }
}
public class SingleThread {
public static void main (String[] args){
MyThread t1 = new MyThread ();
t1.start ();
     }
}