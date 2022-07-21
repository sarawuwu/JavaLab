package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("C:\\java\\io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				) {
			
			
			System.out.println("available="+ fis.available());
			
			int b = bis.read(); //一次讀一個byte
			System.out.println("byte="+b);
			//把b轉成文字的形式 ascii table
			char c =(char)b;
			System.out.println(c);
		
			System.out.println("available="+ fis.available());
			
			b= bis.read(); //再讀一個byte，如果回傳-1，表示獨到底了，沒有東西了
			c = (char)b;
			System.out.println(c);
		
		
			System.out.println("available="+ fis.available());
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
