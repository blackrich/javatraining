package socket;

import java.net.*;
import java.io.*;

public class client {
	public static void main(String[] args){
		Socket client;
		
		try {
			
			System.out.println("connect succes with server");
			
			boolean flag = true;
			
			do {
				client = new Socket("192.168.2.254", 6000);
				InputStream is = client.getInputStream();
				DataInputStream din = new DataInputStream(is);
				
				String message = din.readUTF();
				System.out.println("msg: " + message);
				
				Thread.sleep(100);
			}while(flag);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
