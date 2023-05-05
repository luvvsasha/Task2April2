
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
 public static void main(String[] args) {
 try (FileInputStream fis = new FileInputStream("test123.txt")) {
  int bajt;
  do {
    bajt = fis.read();
if (bajt != -1)
    System.out.println((char) bajt);
 } while (bajt != -1);
   } catch (FileNotFoundException e) {
      System.out.println("File not found");
 } catch (IOException e) {
      System.out.println("Error reading file");
    }
   }
}


