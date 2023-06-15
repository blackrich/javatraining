package homework;

import java.util.*;

public class ex1 {
	public static void func1(List<String> list) {
		list.add("AAAAAAAA");
		list.add("BB");
		list.add("CCCCCCC");
		
		for(String str : list) {
			if(str.length() > 5) {
				System.out.print(str + " ");
			}
		}
		
		System.out.println();
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		//func1함수 완성하기
	}
	public static List<String> func2() {
		
		ArrayList<String> str = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		System.out.println("put -1 if you want get out");
		do {

			tmp = sc.nextLine();
			if(tmp.length() > 5) {
				str.add(tmp);
			}
			
		}while(!tmp.equals("-1"));
		

		for(String s : str) {
			System.out.print(s + " "); 
		}

		System.out.println();
		return str;
		
		
		
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 입력받는 코드를 작성하세요.
		//func2함수 완성하기
		
	}
	public static void func3() {
		
		ArrayList<Integer> getval = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("put -1 if you want get out");
		do {
			i = sc.nextInt();
			if(i%2 == 0) {
				getval.add(i);
			}
		}while(i > 0);
		

		for(int j : getval) {
			System.out.print(j + " ");
		}
		

		System.out.println();
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기
	}
	public static void main(String[] args) {
		func1(new ArrayList());
		List<String> list = func2();
		func3();
		
	}
}
