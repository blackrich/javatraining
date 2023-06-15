package smallworld;

import java.util.*;

public class Search {
	public Search(ArrayList<_Object> al) {
		
		int checktmp = 0;
		
		for(_Object obj1 : al) {
//			System.out.println("flag!! check obj1 value is ok. obj1: " + obj1.getname());
			for(_Object obj2 : al) {
				if(obj1.getatk().equals(obj2.getatk())) checktmp++;
				if(obj1.getdef().equals(obj2.getdef())) checktmp++;
				if(obj1.getlvl().equals(obj2.getlvl())) checktmp++;
				if(obj1.gettype().equals(obj2.gettype())) checktmp++;
				if(obj1.getel().equals(obj2.getel())) checktmp++;

				if(checktmp == 1) {
//					System.out.println("flag!! checktmp is 1");
					System.out.println(obj1.getname() + " - " + obj2.getname());
					checktmp = 0;
				} else {
//					System.out.println("flag!! checktmp is not 1. obj1: " + obj1.getname());
					checktmp = 0;
				}
				
			}
		}
	}
	public void _Print() {
		
	}
}
