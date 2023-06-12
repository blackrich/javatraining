package smallworld;

import java.util.*;

public class _Input {
	
//    String filePath = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
//    String fileName = "smallworld.txt";
	
	public ArrayList<_Object> _input(ArrayList<_Object> al) {
		Scanner sc = new Scanner(System.in);
		_Object _obj = new _Object();
	    
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
		
		sc.close();
		
		return al;
		
	}

}
