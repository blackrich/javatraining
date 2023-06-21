package socket3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class clientrecv implements Runnable{

	Socket client;
	ServerSocket server;
	
	clientrecv(Socket client){
		this.client = client;
	}
	
	@Override
	public void run() {
		
		try {
			server = new ServerSocket(6000);
			client = server.accept();
			
			InputStream is = client.getInputStream();
			DataInputStream din = new DataInputStream(is);
			String recv = null;
			
			do {				
				
				recv = din.readUTF();
				if(recv.equals("q") || recv == null) System.exit(-1);;
				System.out.println("server msg: " + recv);
				
			}while(true);
			
		}catch(Exception e) {
			
		}

	}

}
