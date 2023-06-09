package calculator;

public class _getValue {
	
	private _storeValue sv = new _storeValue();
	private calculate cal = new calculate();
	private double result;
	private String str = "";
	
	public void get(String str) {
		this.str += str;
		System.out.println(this.str);
		if(str.endsWith("=")) split();
	}
	
	private void split() {
			String getnum = "";
			for(String val : str.split("")) {
				switch(val) {
				case"0":
				case"1":
				case"2":
				case"3":
				case"4":
				case"5":
				case"6":
				case"7":
				case"8":
				case"9":
					getnum += val;
					break;
				case"+": 
				case"-": 
				case"*": 
				case"/": 
					if(getnum.equals("")) { //받은 문자열에서 문자를 먼저 받았을 때에 대한 예외처리
						if(val.equals("+") || val.equals("-")) {
							getnum = "0";
						}
						else {
							getnum = "1";
						}
					}
					sv.setValue(Double.parseDouble(getnum), val); //피연산자, 연산자 저장
					getnum = "";
					break;
				case"=": 
					if(!getnum.equals("")) sv.setValue(Double.parseDouble(getnum)); // =만 받았을 때에 대한 예외처리
					getnum = "";
					result = cal.cal(sv.getnumal(), sv.getopral());
					return;
				case"(":
				default: 
					System.out.print("Error! unidentified charactor");
					System.exit(0);
				}
			}
			sv.setValue(Double.parseDouble(getnum));
		}
	public double _ReturnValue() {
		return this.result;
	}
}
