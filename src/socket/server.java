package socket;

import java.net.*;
import java.io.*;


public class server {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//192.168.2.22/5000
		//192.168.2.254/5000
		
		ServerSocket server;
		Socket client;
		try {
			server = new ServerSocket(5000);
			client = server.accept();
			System.out.println(client.getInetAddress() + "is connected");
			
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(client.getInetAddress() + " is connected. [by server]\n");
			dos.flush();
			dos.close();
			
			System.out.println("done");
			server.close();
			client.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
