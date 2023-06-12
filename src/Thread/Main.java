package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
        TimeBroadcastThread thread = new TimeBroadcastThread();
        thread.start();
    }
}

class TimeBroadcastThread extends Thread {
    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
        
        boolean flag = true;
        int x = 10;
        int i = 0;
        
        while (true) {
            String currentTime = dateFormat.format(new Date());
            System.out.print("Current Time: " + currentTime);
            


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
                Thread.sleep(1000); // 1초마다 갱신
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}