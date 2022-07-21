package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File dir = new File("C:\\JavaWorkplace\\JavaLab\\src");
		File[] files = dir.listFiles();
		
		for (File file : files) {
			System.out.println(file.getName()+(file.isDirectory()?"是目錄":"不是目錄"));
			long lastModified = file.lastModified(); //不是java.util.Date 是一個long的值
			
			//這個Date是java.util.Date
			Date date = new Date(lastModified);
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
			System.out.println(df.format(date));
			
			
		}
		
	}

}
