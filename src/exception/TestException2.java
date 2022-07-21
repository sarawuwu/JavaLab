package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {
		
		try {
			checkFile("c:\\java\\aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	
	public static void checkFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		if (!file.exists()) {
			//產生exception物件
			//FileNotFoundException fne = new FileNotFoundException(filePath+"找不到檔案");
			//用throw拋出這個exception
			//throw fne;
			
			//通常會這樣寫，把上面合併
			throw new FileNotFoundException(filePath+"找不到檔案");
		}
		
	}
	
	
	
}
