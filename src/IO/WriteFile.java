package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		try( FileOutputStream fos = new FileOutputStream("c:\\java\\io_2.txt"); 
				BufferedOutputStream bos = new BufferedOutputStream(fos);			
				){
			
			
			
			
			String content ="中文abc123";
			byte[] bytes = content.getBytes(); //把string轉乘byte[]，才能寫到FileNotFoundException中
			bos.write(bytes);
			System.out.println("done");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
