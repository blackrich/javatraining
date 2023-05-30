package stone;

import java.util.*;

public class main {

	public static void main(String[] args) {
		String[][] stone = new String[3][10];
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				stone[i][j] = "□";
			}
		}
		

		
		Scanner sc = new Scanner(System.in);
		random rd = new random();
		
		int cnt = 0;
		int pick;
		int pos = 75;
		int iswin = 0;
		int cnt1, cnt2, cnt3, tmp;
		cnt1 = cnt2 = cnt3 = tmp = 0;
		
		
		do {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(i + ": ");
				for(int j = 0 ; j < 10 ; j++) {
					System.out.print(stone[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("possibility: " + pos);
			System.out.print("where?(0, 1, 2): ");
			pick = sc.nextInt();
			

			
			switch(pick) {
				case 0: tmp = cnt1; cnt1++; break;
				case 1: tmp = cnt2; cnt2++; break;
				case 2: tmp = cnt3; cnt3++; break;
			}
			
			if(tmp < 10) {
				iswin = rd.random(pos);
				if(iswin == 0) {
					stone[pick][tmp] = "☆";
					tmp++;
					pos += 10;
					if(pos > 75) pos = 75;
				}else {
					stone[pick][tmp] = "★";
					tmp++;
					pos -= 10;
					if(pos < 25) pos = 25;
				}
						
				cnt++;

			}else {
				System.out.print("세공 횟수 초과!");
			}
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        System.out.println();
		}while(cnt < 31 );
	}
}

class random{
    public int random(int value) {
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; // 1에서 100까지의 랜덤 수
        if(randomNumber < value) return 1;
        
        
        return 0;
    }
}
