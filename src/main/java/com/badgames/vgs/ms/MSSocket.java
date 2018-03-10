package com.badgames.vgs.ms;

import java.io.IOException;
import java.net.ServerSocket;

public class MSSocket {
	
	public ServerSocket socket;
	
	public MSSocket() {
		
		try {
			socket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
