package streamtest;

import java.io.*;
import java.util.*;

public class _Stream {
	
	
	public void _inputStream(String filePath, String fileName) {
		_Print pt = new _Print();
		
	    try {
	        FileInputStream fis = new FileInputStream(filePath + fileName);
	        ObjectInputStream ois = new ObjectInputStream(fis);

	        
			ArrayList<customer> inputal = (ArrayList<customer>) ois.readObject();

            for (customer c : inputal) {
                System.out.println("id: " + c.get_id());
                System.out.println("name: " + c.get_name());
                System.out.println("age: " + c.get_age());
            }
            
	        pt._printCustomer(inputal);

            fis.close();
            ois.close();

	        System.out.println("Objects have been read to the file.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
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
