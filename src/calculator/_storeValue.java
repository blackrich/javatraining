package calculator;

import java.util.*;

public class _storeValue {

	private ArrayList<String> numal = new ArrayList<String>();
	private ArrayList<String> opral = new ArrayList<String>();
	
	public void setValue(String num, String opr) {
		this.numal.add(num);
		this.opral.add(opr);
	}
	public void setNum(String num) {
		this.numal.add(num);
	}
	public void setOpr(String opr) {
		this.opral.add(opr);
	}
	
	public void setContinueValue() {
		this.numal.remove(getnumalSize()-1);
	}
	
	public ArrayList<String> getnumal(){
		return numal;
	}
	public ArrayList<String> getopral(){
		return opral;
	}
	public int getnumalSize() {
		return numal.size();
	}
	
	public void checkFunc() {
		for(String num : numal) System.out.print(num + " ");
		System.out.println();
		for(String opr : opral) System.out.print(opr + " ");
		System.out.println();
	}
	
}
