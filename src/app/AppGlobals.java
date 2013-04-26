package app;

import java.util.Collection;

import javax.swing.JList;

import com.google.gson.Gson;

import network.*;

import room.Room;
import tournament.Tournament;

public class AppGlobals {

	public static Collection<Long> userList;
	public static Collection<Room> roomList;
	public static Collection<Tournament> tournamentList;
	public static Long localUserId;
	public static GameServerClient gameServer;
	public static Gson gson = new Gson();
	
	
}
