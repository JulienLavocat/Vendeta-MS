package com.badgames.vgs.ms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import com.badgames.vgs.gs.Room;

public class RoomSpawner {

	public static HashMap<UUID, Room> rooms = new HashMap<UUID, Room>();
	public static int roomPort = 20000;
	
	public static Room addRoom(ArrayList<UUID> players) {
		roomPort++;			
		if(roomPort > 65535)		//Check if port does not exceed hardware port limit (TCP/IP stack limit -> port are stored in a 16-bit int)
			return null;
		
		Room r = new Room(players);				//Create room
		rooms.put(r.getID(), r);					//Keep track of the room
		new Thread(r, "Room-"+roomPort).start();	//Start room thread
		return r;
	}
	
	public static Room getRoom(UUID id) {
		return rooms.get(id);
	}
	
	public static Room removeRoom(UUID id) {
		return rooms.remove(id);
	}
	
}
