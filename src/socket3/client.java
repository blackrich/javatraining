package socket3;

import java.net.ServerSocket;
import java.net.Socket;

public class client {

	public static void main(String[] args) {

		try {

			Socket client = new Socket("192.168.2.22", 5000);
			
			clientsend csend = new clientsend(client);
			clientrecv crecv = new clientrecv(client);
			
			Thread csendth = new Thread(csend);
			Thread crecvth = new Thread(csend);
			
			csendth.run();
			crecvth.run();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
