package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
        TimeBroadcastThread thread = new TimeBroadcastThread();
        thread.start();
        starload thread2 = new starload();
        thread2.start();
//        starload thread3 = new starload();
//        thread3.start();
    }
}

class TimeBroadcastThread extends Thread {
    @Override
    public void run() {
    	
    	while(true) {
    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
            String currentTime = dateFormat.format(new Date());
            System.out.print("Current Time: " + currentTime);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초마다 갱신
    	}
    	
        
    }
}

class starload extends Thread{
	public void run() {

        boolean flag = true;
        int x = 10;
        int i = 0;
        
        while (true) {
    			for(int j = 1 ; j < x - i ; j++) {
    				System.out.print("*");
    			}
    			for(int k = 0 ; k < i*2+1 ; k++) {
    				System.out.print(" ");
    			}
    			for(int j = 1 ; j < x - i ; j++) {
    				System.out.print("*");
    			}
    			
                if(i == x-2) flag = false;
                else if(i == 0) flag = true;
                
                if(flag) i++;
                else i--;

            

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
	}
}