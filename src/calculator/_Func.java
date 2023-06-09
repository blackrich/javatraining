package calculator;

import java.util.Scanner;

public class _Func {
	
	private static _getValue val;
	
	public void _Func() {
		_InputFunc();
		_OutputFunc();
	}
	static void _InputFunc() {
			Scanner sc = new Scanner(System.in);
			val = new _getValue();
			String tmp = "";
			
			System.out.println("값을 넣으세요(끝낼 경우 '='를 입력): ");
			do {
				tmp = sc.nextLine();
				val.get(tmp); 
			}while(!tmp.endsWith("="));
		
			sc.close();
	}
	static void _OutputFunc() {
		System.out.print("result: " + val._ReturnValue());
	}
}
