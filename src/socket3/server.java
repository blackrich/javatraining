package socket3;

import java.net.*;

public class server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket server = new ServerSocket(5000);
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " has connected");
			
			
			serversend ssend = new serversend(client);
			serverrecv srecv = new serverrecv(client);
			
			Thread ssendth = new Thread(ssend);
			Thread srecvth = new Thread(ssend);
			
			ssendth.run();
			srecvth.run();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

}
