package com.badgames.vgs.gs;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.UUID;

import com.badgames.vgs.ms.MasterServer;

public class Room implements Runnable {

	private ArrayList<UUID> players;
	private UUID id;
	private ServerSocket socket;
	private boolean hasEnded;
	
	public Room(ArrayList<UUID> players) {
		
		this.players = players;
		this.id = UUID.randomUUID();
		try {
			this.socket = new ServerSocket(MasterServer.port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		
		while(!hasEnded) {
			try {
				new Processor(socket.accept());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public UUID getID() {
		return id;
	}
	
	public ArrayList<UUID> getPlayers() {
		return players;
	}
	
}
