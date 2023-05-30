package streamtest;

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {

	    String filePath = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
	    String fileName = "tmpstream.txt";

	 
	    _OutputStream _os = new _OutputStream();
	    _os._outputStream(filePath, fileName);
	    
	    _InputStream _is = new _InputStream();
	    _is._inputStream(filePath, fileName);
	    
	}
}
