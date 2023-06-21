package socket;

import java.io.*;
import java.net.*;

public class ddos {
	public static void main(String[] args){
		
        Thread thread = new Thread(() -> {
            
        	try {
    			System.out.println("connect succes with server");
    			
    			boolean flag = true;
    			
    			do {
    				Socket client = new Socket("192.168.2.254", 6000);
    				InputStream is = client.getInputStream();
    				DataInputStream din = new DataInputStream(is);
    				
    				String message = din.readUTF();
    				System.out.println("msg: " + message);
    				
    				Thread.sleep(100);
    			}while(flag);
    			
    			
    		}catch(Exception e){
    			e.printStackTrace();
    		}
        });
        thread.start();
	}
}