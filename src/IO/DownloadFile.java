package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadFile {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		try(InputStream is = url.openStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream("c:\\java\\a.jpg"); 
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			
			byte[] buffer = new byte[1024]; //自己訂這個大小
			int length;
			while ((length = bis.read(buffer)) !=-1) {
				bos.write(buffer,0,length);
			}
			System.out.println("done");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
