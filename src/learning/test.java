package learning;

public class test {
	public static void main(String[] args) {
		System.out.println("hello, world!");
		
		int i;
		String str = "31415927";
		
		i = Integer.valueOf(str); //문자열5를 integer객체로 변환
		System.out.println("valueOf: " + i);
		
		i = Integer.parseInt(str); // 
		System.out.println("parseInt: " + i);
		
		System.out.print("char: ");
		for(int a = 0 ; a < str.length() ; a++) {
			i = str.charAt(a);
			System.out.print(i + " ");
		}
		System.out.println();
		
		f1();
		
	}
	
	static void f1() {
		l01 l01 = new l01();
		
		l01.sum(1, 2, 3);
	}


}
