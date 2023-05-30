package streamtest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class _InputStream {
	
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

}
