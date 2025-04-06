22. Write a java program to copy the alternate character the constant of a file data1.text to a file text.2

import java.FileInputStream;
import java.FileOutputStream;
import java.IOException;
class copyFile {
public static void main (String[] args) throws
IOException {
FileInputStream r = new FileInputStream ("example.txt");
FileOutputStream w = new FileOutputStream ("new.txt");
int i;
While ((i = r.read(i))= -1) {
w.write ((char)i);
}
System.out.println (Data copied successfully);
     }
}