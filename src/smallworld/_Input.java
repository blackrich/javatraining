package smallworld;

import java.io.*;
import java.util.*;

public class _Input {
	
	public void _input() {
		Scanner sc = new Scanner(System.in);
		ArrayList<_Object> al = new ArrayList<_Object>();
		_Object _obj = new _Object();
	    String filePath = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
	    String fileName = "tmp.txt";
	    
	    String name, type, elem;
	    int atk, def, lvl;
	    
	    
		do {
			System.out.print("name(if you wanna break, put 'done'): ");
			name = sc.next();
			if(name.equals("done")) break;
			System.out.print("level: ");
			lvl = sc.nextInt();
			System.out.print("atk: ");
			atk = sc.nextInt();
			System.out.print("def: ");
			def = sc.nextInt();
			System.out.print("type: ");
			type = sc.next();
			System.out.print("element: ");
			elem = sc.next();
			_obj.setter(name, lvl, atk, def, type, elem);
			al.add(_obj);
			break;

		}while(true); 
		
		
		

		
		
		try {
	        FileOutputStream fos = new FileOutputStream(filePath + fileName);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);

	        oos.writeObject(al);

	        fos.close();
	        oos.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
