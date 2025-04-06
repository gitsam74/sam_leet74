26. Write a java program using multithreading concept bt implementing runnable interface.

class Task implements Runnable {
public void run () {
System.out.println ("task by implementing runnable");
      }
}
public class RunnableTask {
public static void main (String[] args) {
Task t = new Task ();
Thread t1 = new Thread (t);
t1.start ();
     }
}