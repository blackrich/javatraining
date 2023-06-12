package smallworld;

import java.util.*;

public class Search {
	public Search(ArrayList<_Object> al) {
		
		int checktmp = 0;
		
		for(_Object obj1 : al) {
			for(_Object obj2 : al) {
				for(int i = 1 ; i < 5 ; i++) {
					if(obj1.getatk() == obj2.getatk()) checktmp++;
					if(obj1.getdef() == obj2.getdef()) checktmp++;
					if(obj1.getlvl() == obj2.getlvl()) checktmp++;
					if(obj1.gettype().equals(obj2.gettype())) checktmp++;
					if(obj1.getel().equals(obj2.getel())) checktmp++;
					
					
					
					if(checktmp == 1) {
						System.out.println("flag!! checktmp is 1");
						checktmp = 0;
						break;
					} else {
						System.out.println("flag!! checktmp is not 1");
						checktmp = 0;
						break;
					}
					
				}
			}
		}
	}
	public void _Print() {
		
	}
}
