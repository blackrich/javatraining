package urlstream;

import java.net.*;
import java.util.*;
import java.io.*;

public class urlstream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("https://finance.naver.com/");
		//URL url = new URL("https://finance.naver.com/");
		
		InputStream bin = url.openStream();
		BufferedInputStream buffIn = new BufferedInputStream(bin);
		Reader reader = new InputStreamReader(buffIn);
		
		
		String strData = "";
		do {
			int intData = reader.read();
			if(intData == -1) break;
			strData += (char)intData;
			
			
		}while(true);

		OutputStream output = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\java_io_file\\parse.txt");
		Writer writer = new OutputStreamWriter(output);
		
		writer.write(strData);
		
		
		//System.out.print(strData);
//		String[] lineData = strData.split("span");
//		
//		for(String str : lineData) {
//			System.out.println(str);
//		}
//		
	}
}
