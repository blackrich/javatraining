package streamtest;

import java.io.*;
import java.util.*;

public class _Print {
	
	private ArrayList<customer> customeral; 
	
	public void _printCustomer(ArrayList al) {
		
		int i = al.size();
		customeral = al;
		
		System.out.println(this.customeral.get(0).get_id());
		System.out.println(this.customeral.get(2).get_name());
		System.out.println(this.customeral.get(1).get_isadmin());
	}
	
	public ArrayList<customer> _returnCustomer() {
		return customeral;
	}
}
