21.Write a java program to read a file.

class FileReader {
public static void main (String[] args){
try {
FileReader H = new FileReader ("example.txt");
try {
int i;
While (i = r.read())! = -1) {
System.out.println ((char)i);
}
finally {
r.close ();
       }
}
catch (IOException e) {
System.out.println ("Exception Handled.....!");
      }
    }
}