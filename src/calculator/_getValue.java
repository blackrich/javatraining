package calculator;

import java.util.*;

public class _getValue {
	
	private _storeValue sv = new _storeValue();
	private calculate cal = new calculate();
	private boolean isContinued;
	private double result;
	
	public void get(String str) {
		try {
			String getnum = "";
			for(String val : str.split("")) {
				switch(val) {
				case"+": 
				case"-": 
				case"*": 
				case"/": 
					if(getnum.equals("")) {
						if(sv.getnumalSize() > 0) {
							sv.setOpr(val);
							break;
						}
						
						if(val.equals("+") || val.equals("-")) {
							getnum = "0";
						}
						else {
							getnum = "1";
						}
					}
					sv.setValue(getnum, val); //피연산자, 연산자 저장
					getnum = "";
					break;
				case"=": 
					if(!getnum.equals("")) sv.setNum(getnum);
					getnum = "";
					result = cal.cal(sv.getnumal(), sv.getopral());
					return;
				default: //요소가 자연수인지 확인 후 getnum 배열에 저장
					if(isContinued) {
						getnum = sv.getnumal().get(sv.getnumalSize()-1);
						isContinued = false;
						sv.setContinueValue();
					}
					if( Integer.parseInt(val) > -1 && Integer.parseInt(val) < 10 ) {
						getnum += val;
					}
					break;
				}
			}
			sv.setNum(getnum);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
	public void continueCheck(boolean isContinued) {
		this.isContinued = isContinued;
	}
	public double _ReturnValue() {
		return this.result;
	}
	
}
