import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) {
		File file=new File("D:VSCODE.java");
		try {
			if(file.createNewFile()){
				System.out.println("file created");
			}else{
				System.out.println("fail/allready available");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
