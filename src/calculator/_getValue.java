package calculator;

import java.util.*;

public class _getValue {
	
	@SuppressWarnings("unlikely-arg-type")
	public void get(String str) {

		_storeValue sv = new _storeValue();
		calculate cal = new calculate();
		

			String getnum = "";
			for(String val : str.split("")) {
				switch(val) {
				case"+": 
				case"-": 
				case"*": 
				case"/": 
					sv.setValue(getnum, val); //피연산자, 연산자 저장
					getnum = "";
					break;
				case"=": 
					sv.setValue(getnum);
					getnum = "";
					
					double result = cal.cal(sv.getnumal(), sv.getopral());
					System.out.println(result);
					return;
				default: //요소가 자연수인지 확인 후 getnum 배열에 저장
					if( Integer.parseInt(val) > -1 && Integer.parseInt(val) < 10 ) {
						getnum += val;
					}
					break;
				}
			}
			try {
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}
	
}
