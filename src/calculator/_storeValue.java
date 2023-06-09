package calculator;

import java.util.*;

public class _storeValue {

	private ArrayList<Double> numal = new ArrayList<Double>();
	private ArrayList<String> opral = new ArrayList<String>();
	
	public void setValue(double num, String opr) {
		this.numal.add(num);
		this.opral.add(opr);
	}
	public void setNum(double num) {
		this.numal.add(num);
	}
	public void setOpr(String opr) {
		this.opral.add(opr);
	}
	
	public ArrayList<Double> getnumal(){
		return numal;
	}
	public ArrayList<String> getopral(){
		return opral;
	}
	public int getnumalSize() {
		return numal.size();
	}
	
	public void checkFunc() {
		for(double num : numal) System.out.print(num + " ");
		System.out.println();
		for(String opr : opral) System.out.print(opr + " ");
		System.out.println();
	}
	
}
