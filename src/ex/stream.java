package ex;

import java.io.*;
import java.util.*;

public class stream {
	public static void main() {
		
		String path = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
		String name = "datastream.txt";
		
		outputstream os = new outputstream();
		try {
			os.outputstream(path, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class outputstream{
	public void outputstream(String filepath, String filename) throws Exception{
		
		FileOutputStream fos = new FileOutputStream(filepath + filename);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("hello, world!");
		dos.writeInt(10);
		dos.flush();
		
		dos.close();
		PrintStream pos = new PrintStream(fos);
		
	}
}
