package test1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many lines?: ");
		int x = sc.nextInt();
		
		for(int i = 0 ; i < x ; i++) {
			for(int j = 1 ; j < x - i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i*2+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

	}

}
