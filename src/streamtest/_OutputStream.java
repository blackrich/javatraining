package streamtest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _OutputStream {
	
	
	public void _outputStream(String filePath, String fileName) {
		customer cs;
		ArrayList<customer> al = new ArrayList<customer>();
		_Print pt = new _Print();
		
		
		cs = new customer();
		cs.setter(0, 27, "lee", false);
		al.add(cs);
		cs = new customer();
		cs.setter(1, 25, "park", true);
		al.add(cs);
		cs = new customer();
		cs.setter(2, 30, "kim", false);
		al.add(cs);
		
		
		
		
	    try {
	        FileOutputStream fos = new FileOutputStream(filePath + fileName);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);

	        oos.writeObject(al);

	        fos.close();
	        oos.close();

	        System.out.println("Objects have been written to the file.");
	        pt._printCustomer(al);
	        
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	}

}
