package socket3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serversend implements Runnable{


	Socket client;
	
	serversend(Socket client){
		this.client = client;
	}
	
	@Override
	public void run() {

		try {
			
		
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			Scanner sc = new Scanner(System.in);
			
			String send = null;
			
			do {
				System.out.println("send message[s]");
				send = sc.nextLine();
				dos.writeUTF(send);
				dos.flush();
				if(send.equals("q")) break;
				
			}while(true);
			
			
			dos.writeUTF(client.getInetAddress() + " is connected. [by server]\n");
			dos.flush();
			dos.close();
			
			System.out.println("done");
			client.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
}
