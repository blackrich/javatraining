package rullet;

import java.util.*;

public class main {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
	
		Scanner sc = new Scanner(System.in);
		String menu = "";
		
		do {
			System.out.print("what do you want to eat(stop: done): ");
			menu = sc.next();
			menu = menu.replaceAll(System.getProperty("line.separator"), "");
			if(menu.equals("done")) break;
			al.add(menu);
//			for(String str : al) {
//				System.out.println(str);
//				System.out.println(al.size());
//			}
		}while(true);
		
		if(al.size() == 0) {
			System.out.println("no food in list.");
			return ;
		}

		System.out.println("food list.");
		for(String list : al) {
			System.out.println(list);
		}
		
		
		random rnd = new random();
		
		int x = 100/al.size();
		int num = rnd.random();
		
		try {
			
//			System.out.println("partition" + x);
//			System.out.println("generated" + num);
			
			
			for(int i = 0 ; i < al.size() ; i++) {
				if(num < (x * (i+1))) {
					
					System.out.println("***** 당첨!! *****");
					System.out.println("      " + al.get(i));
					System.out.println("*****************");
					break;
				}
			}
			
		}catch(Exception e){
			System.out.println("Exception!!: ");
			System.out.println(e);
		}

	}
	
}

class random{
    public int random() {
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; // 1에서 100까지의 랜덤 수
       
        return randomNumber;
    }
}
