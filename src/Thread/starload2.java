package Thread;

public class starload2 {
	public void star() {
		int i = 0;
		int row = 20;
		int x, y;
		x = y = 0;
		boolean flag = false;
		
		while(i >= 0) {
			while(row-i > x) {
				System.out.print(" ");
				x++;
			}
			while(i*2+1 > y) {
				System.out.print("*");
				y++;
			}
			
			System.out.println();
			
			x = y = 0;
			
			if(i >= row) {
				flag = true;
			}
			
			if(i <= 0) {
				flag = false;
			}
			
			if(flag) {
				i--;
			}
			else {
				i++;	
			}
			try {Thread.sleep(25);}
			catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}
}
