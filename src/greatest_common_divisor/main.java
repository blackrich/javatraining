package greatest_common_divisor;

import java.util.*;


public class main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("get num: ");
		int x = sc.nextInt();
		
		for(int i = 1 ; i <= x ; i++) {
			if(x % i == 0) {
				al.add(i);
			}			
		}
		System.out.print("Greate Common Divisor of " + x + ": ");
		for(int j : al) {
			System.out.print(j + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
