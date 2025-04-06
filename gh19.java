19. Write a java program for Input/Output exception and write a code to create a file.

import java.io.File;
import java.io.IOException;
public class FileExample {
public static void main (String[] args){
File file = new File ("example.txt");
try {
if (File.CreateNewFile()){
System.out.println ("File created:"+File.getName(1));
}
else {
System.out.println ("File already exists");
       }
}
catch (IOException e) {
System.out.println ("An error occurred");
e.printStackTrace();
        }
     }
}
