package calculator;

import java.util.*;

public class calculate {
	public double cal(ArrayList<String> tmpnumal, ArrayList<String> tmpopral) {
		
		for(int i = 0 ; i < tmpopral.size() ; i++) {
			System.out.print(tmpnumal.get(i) + " " + tmpopral.get(i) + " ");
		}
		System.out.println(tmpnumal.get(tmpopral.size()) + " = ");
		
		
		int speed2opr = 0; // 곱셈, 나눗셈 갯수 확인용 변수 선언.
		for(String tmp : tmpopral) {
			if(tmp.equals("*") || tmp.equals("/")) speed2opr++;
		}

		 for(int a = 0 ; a < speed2opr ; a++) { //곱셈, 나눗셈 있는 횟수 만큼 연산
			 
				for(String tmp : tmpnumal) { //연산과정출력
					System.out.print(tmp + " ");
				}
				for(String tmp : tmpopral) {
					System.out.print(tmp + " ");
				}
				System.out.println();
			 
			 
			outerLoop: for(int i = 0 ; i < tmpopral.size() ; i++) {//곱셈, 나눗셈 우선 연산
				switch(tmpopral.get(i)) {//연산자 감지
					case"+"://+와 -연산은 먼저 계산하지 않고 진행.
					case"-":
						break;
					case"*"://*와 /연산을 먼저 계산.
					case"/":
						if(tmpopral.get(i).equals("*")) {//*와 / 연산을 진행하여 피연산자 arraylist에 set
							tmpnumal.set(i, String.valueOf(Double.parseDouble(tmpnumal.get(i)) * Double.parseDouble(tmpnumal.get(i+1)))); 
						}else if (tmpopral.get(i).equals("/")) {
							tmpnumal.set(i, String.valueOf(Double.parseDouble(tmpnumal.get(i)) / Double.parseDouble(tmpnumal.get(i+1))));
						}
					default: //연산 이후 set한 값 이후의 값을 앞으로 한 칸 씩 당김.
						for(int j = i ; j < tmpopral.size() ; j++) {
							if(j+1 > tmpopral.size()-1) {
								tmpnumal.remove(tmpnumal.size()-1);
								tmpopral.remove(tmpopral.size()-1);
								break outerLoop; //배열 뒤의 값을 당긴 이후 다시 처음부터 계산 진행
							}
							tmpopral.set(j, tmpopral.get(j+1));
							tmpnumal.set(j+1, tmpnumal.get(j+2));
						}
						break;
				}	
			}
		}

		int speed1opr = tmpopral.size();
		for(int a = 0 ; a < speed1opr ; a++) { //덧셈 뻴셈 있는 횟수 만큼 연산
			 
			for(String tmp : tmpnumal) { //연산과정출력
				System.out.print(tmp + " ");
			}
			for(String tmp : tmpopral) {
				System.out.print(tmp + " ");
			}
			System.out.println();
			 
			outerLoop: for(int i = 0 ; i < tmpopral.size() ; i++) {//나머지 연산
				switch(tmpopral.get(i)) {//연산자 감지
					case"+"://+와 -연산은 먼저 계산하지 않고 진행.
					case"-":
						if(tmpopral.get(i).equals("+")) {//+와 -연산을 진행하여 피연산자 arraylist에 set
							tmpnumal.set(i, String.valueOf(Double.parseDouble(tmpnumal.get(i)) + Double.parseDouble(tmpnumal.get(i+1)))); 
						}else if (tmpopral.get(i).equals("-")) {
							tmpnumal.set(i, String.valueOf(Double.parseDouble(tmpnumal.get(i)) - Double.parseDouble(tmpnumal.get(i+1))));
						}
					default: //연산 이후 set한 값 이후의 값을 앞으로 한 칸 씩 당김.
						for(int j = i ; j < tmpopral.size() ; j++) {
							if(j+1 > tmpopral.size()-1) {
								tmpnumal.remove(tmpnumal.size()-1);
								tmpopral.remove(tmpopral.size()-1);
								break outerLoop; //배열 뒤의 값을 당긴 이후 다시 처음부터 계산 진행
							}
							tmpopral.set(j, tmpopral.get(j+1));
							tmpnumal.set(j+1, tmpnumal.get(j+2));
						}
						break;
				}	
			}
		 }
		return Double.parseDouble(tmpnumal.get(0));
	}
}
