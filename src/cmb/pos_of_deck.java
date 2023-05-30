package cmb;

import java.util.*;

public class pos_of_deck {
	
	public void _Func() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("총 매수: ");
	    int total = sc.nextInt();
		
	    System.out.print("초동의 개수: ");
	    int white = sc.nextInt();
		
	    System.out.print("드로우 수: ");
	    int draw = sc.nextInt();

		System.out.print("최소 매수: ");    
	    int min = sc.nextInt();

		System.out.print("최대 매수: ");
	    int max = sc.nextInt();
	        
	    double result = 0;
	        
	    noc_cal nc = new noc_cal();
	        
	    for (int i = min; i <= max; i++) {
	        double whitecbn = nc._Func(white, i, "c");
	        double othercbn = nc._Func(total - white, draw - i, "c");
	            
	        result += whitecbn * othercbn;
	    }
	    
	    System.out.printf("초동을 뽑을 확률: %.3f", (result / nc._Func(total, draw, "c")) * 100);
	    
	    sc.close();
	}
}
