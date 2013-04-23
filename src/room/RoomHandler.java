package room;

import gui.GUIManager;

import javax.swing.JList;

import app.AppGlobals;


public class RoomHandler {
	
	public static void addRoomEntry(Room room){
		if(AppGlobals.roomList != null){
			if(!AppGlobals.roomList.contains(room))
				AppGlobals.roomList.add(room);
		}	
	}
	
	public static void removeRoomEntry(JList<Room> listBox ,Room room){
		if(AppGlobals.roomList != null){
			if(AppGlobals.roomList.contains(room))
				AppGlobals.roomList.remove(room);
		}	
	}
	
	public static void updateRoomListbox(){
		if(GUIManager.serverTabUnrankedListbox != null && AppGlobals.roomList != null){
			//GUIManager.serverTabUnrankedListbox.;
		}
	}

}
