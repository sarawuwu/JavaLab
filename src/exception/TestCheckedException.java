package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckedException {

	/*public static void main(String[] args) {
		//FileNotFoundException，其他，非RuntimeException子類別
		//ctrl+1:快速幫你修正 帶入try catch
		try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");  //路徑可以用\\或單一/
		// FileReader fr = new FileReader("c:/java/aaa.txt"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}*/

	
	//把錯誤往外丟，看誰呼叫這個方法就要處裡
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\java\\aaa.txt");
	}
	
	
	
	
	
	
}
