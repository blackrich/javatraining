package smallworld;

import java.util.*;

public class Search {
	public Search(ArrayList<_Object> al) {
		
		int check1tmp = 0;
		int check2tmp = 0;
		
		for(_Object obj1 : al) {
//			System.out.println("flag!! check obj1 value is ok. obj1: " + obj1.getname());
			for(_Object obj2 : al) {
				if(obj1.getatk().equals(obj2.getatk())) check1tmp++;
				if(obj1.getdef().equals(obj2.getdef())) check1tmp++;
				if(obj1.getlvl().equals(obj2.getlvl())) check1tmp++;
				if(obj1.gettype().equals(obj2.gettype())) check1tmp++;
				if(obj1.getel().equals(obj2.getel())) check1tmp++;

				if(check1tmp == 1) {
//					System.out.println("flag!! checktmp is 1");
					for(_Object obj3 : al) {
						if(obj2.getatk().equals(obj3.getatk())) check2tmp++;
						if(obj2.getdef().equals(obj3.getdef())) check2tmp++;
						if(obj2.getlvl().equals(obj3.getlvl())) check2tmp++;
						if(obj2.gettype().equals(obj3.gettype())) check2tmp++;
						if(obj2.getel().equals(obj3.getel())) check2tmp++;
						
						if(check2tmp == 1) {
							String result = obj1.getname() + " - " + obj2.getname() + " - " + obj3.getname();
							System.out.println(result);
							resultal.add(result);
						}
						check2tmp = 0;
					}
					check1tmp = 0;
				} else {
//					System.out.println("flag!! checktmp is not 1. obj1: " + obj1.getname());
					check1tmp = 0;
				}
				
			}
		}
	}
	
	
	ArrayList<String> resultal = new ArrayList<String>();
	
	public ArrayList<String> _ReturnResult(){
		return this.resultal;
	}
	

}
