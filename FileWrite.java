import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:VSCODE.javaa");
        fw.write("Jay Ganesh");
        fw.close();

    }
}
