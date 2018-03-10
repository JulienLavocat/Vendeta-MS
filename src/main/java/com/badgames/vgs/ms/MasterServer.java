package com.badgames.vgs.ms;

import java.util.ArrayList;
import java.util.UUID;

public class MasterServer {

	public static MasterServer instance;
	public static int port = 20000;

	public MasterServer() {
		
		instance = this;
		
		ArrayList<UUID> pls = new ArrayList<UUID>();
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		pls.add(UUID.randomUUID());
		
		RoomSpawner.addRoom(pls);
		
	}

	public void startMatch(ArrayList<UUID> players) {
		
		RoomSpawner.addRoom(players);
		
	}

}
