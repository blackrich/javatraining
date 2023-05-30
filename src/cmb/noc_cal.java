package cmb;

public class noc_cal {
	
	private double result;
	private int x, y;
	
	public double _Func(int x, int y, String op) {
		
		this.x = x;
		this.y = y;
		
		switch (op) {
			case "p": 
			case "P": _P(); break;
			case "c": 
			case "C": _C(); break;
			case "rp": 
			case "Rp": 
			case "rP": 
			case "RP": _RP(); break;
			case "rc": 
			case "Rc": 
			case "rC": 
			case "RC": _RC(); break;
			case "b": _B(); break;
			default : System.out.println("wrong operator"); return 0;
			
		}
		return result;

	}
	private void _P() {
		// 순열: n개의 원소 중 r개를 순서에 상관 있게 선택하는 경우의 수
		// P(n, r) = n! / (n - r)!
		result = factorial(x) / factorial(x-y);
	}
	private void _C() {
		// 조합: n개의 원소 중 r개를 순서에 상관 없이 선택하는 경우의 수
		// C(n, r) = n! / (r! * (n - r)!)
		result = factorial(x) / (factorial(y) * factorial(x-y));
	}
	private void _RP() {
		// 중복 순열: n개의 원소 중 r개를 순서에 상관 있게 선택하되, 중복을 허용하는 경우의 수
		// P(n, r) = n^r
		result = Math.pow(x, y);
	}
	private void _RC() {
		// 중복 조합: n개의 원소 중 r개를 순서에 상관 없이 선택하되, 중복을 허용하는 경우의 수
		// C(n + r - 1, r)
		result = factorial(x+y-1) / (factorial(y) * factorial(x-1));
		
	}
	private void _B() {
		// 이항 계수: 이항식의 계수를 계산하는 경우의 수
		// C(n, r) = n! / (r! * (n - r)!)
		result = factorial(x) / (factorial(y) * factorial(x-y));
	}
	
	public double factorial(double i) {
		double factorial = 1;
		for (double a = 1; a <= i; a++) {
		    factorial *= a;
		};
		
		return factorial;
	}
	
	
}
