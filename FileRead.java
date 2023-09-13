import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file=  new File("D:VSCODE.java");
         Scanner sc=new Scanner(file);
         while (sc.hasNext()) {
            String str=(String) sc.next();
            System.out.println(str);
         }
        
    }
    
}
