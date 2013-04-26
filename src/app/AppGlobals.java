package app;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JList;

import network.*;

import room.Room;
import tournament.Tournament;

public class AppGlobals {

	public static Collection<Long> userList = new ArrayList<Long>();
	public static Collection<Room> roomList = new ArrayList<Room>();
	public static Collection<Tournament> tournamentList = new ArrayList<Tournament>();
	public static Long localUserId;
	public static GameServerClient gameServer;
	
	
}
