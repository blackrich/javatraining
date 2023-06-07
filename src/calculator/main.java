package calculator;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_getValue val = new _getValue();
		String tmp = "";
		
		
		System.out.println("값을 넣으세요(끝낼 경우 '='를 입력): ");
		do {
			tmp = sc.nextLine();
//			tmp = "5*10+20/20+15/3+19/4-7";
//			tmp += "5*10+20/29/4-7=";
			System.out.println(tmp);
			val.get(tmp); 
		}while(!tmp.endsWith("="));
		
		
		System.out.print("done");
		
	}
}
