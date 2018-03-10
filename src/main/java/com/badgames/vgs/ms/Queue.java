package com.badgames.vgs.ms;

import java.util.ArrayList;
import java.util.UUID;

public class Queue {
	
	private static ArrayList<UUID> queue = new ArrayList<UUID>();
	
	public static void addToQueue(UUID id) {
		queue.add(id);
		while(queue.size() > 10) {
			ArrayList<UUID> pls = (ArrayList<UUID>) queue.subList(0, 9);
			queue.removeAll(pls);
			MasterServer.instance.startMatch(pls);
		}
	}
	
	public static void removeFromQueue() {
		
	}
	
}
