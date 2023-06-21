package socket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		ServerSocket server;
		Socket client;
		try {
			server = new ServerSocket(6000);
			client = server.accept();
		
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			
			client = new Socket("192.168.2.254", 6000);
			
			InputStream is = client.getInputStream();
			DataInputStream din = new DataInputStream(is);
			
			Scanner sc = new Scanner(System.in);
			
			String recv = null;
			String send = null;
			
			do {				
				
				recv = din.readUTF();
				if(recv.equals("q") || recv == null) break;
				System.out.println("clinet msg: " + recv);
				
				
				System.out.println("send message");
				send = sc.nextLine();
				dos.writeUTF(send);
				dos.flush();
				if(send.equals("q")) break;
				
			}while(true);
			
			
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
