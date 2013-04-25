package main;

import gui.GUIHandler;
import gui.LoginWindow;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import network.GameServerClient;
import network.ServerPackets;

import app.AppGlobals;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//INIT STUFF like loading configs

		updateLAF();
		//start gui
		GUIHandler.launchLoginWindow();
		AppGlobals.gameServer = new GameServerClient();
		AppGlobals.gameServer.Connect("127.0.0.1",7922);
		
		AppGlobals.gameServer.SendPacket(ServerPackets.Ping);
		//Check login then launch main window
		GUIHandler.launchMainWindow();
	}
	

	
	
	public static void updateLAF(){

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

	}

}
