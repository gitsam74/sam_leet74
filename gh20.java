20. Write a java program to write into a file.

class FileWriter {
public static void main (String[] args){
try {
FileWriter f = new FileWriter ("example.txt");
try {
F.Write ("Java is the best language.......!");
}
finally {
F.close ();
}
System.out.println ("Successfully data wrote in File");
}
catch (IOException i) {
System.out.println (i);
        }
    }
}
