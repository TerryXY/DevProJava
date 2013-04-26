package network;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import app.AppGlobals;

public class GameServerClient extends Thread
{
	public Socket connection = null;
	public DataInputStream receive = null;
	public DataOutputStream send = null;
	public Boolean isConnected = false;
	String ip = "";
	int port = -1;
	
	public GameServerClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run()
	{
		if(ip != "" && port != -1){
			if(connect(this.ip, this.port));
				updateLoop();
		}
	}
	
	public boolean connect(String server,int port)
	{

		try {
			this.connection = new Socket(server,port);
			this.receive = new DataInputStream(connection.getInputStream());
			this.send = new DataOutputStream(connection.getOutputStream());
		} catch (IOException e) {
			System.out.println("Couldn't connecto server");
			e.printStackTrace();
			return false;
		}

		isConnected = true;
		System.out.println("Connected to " + server + " Port: " + port);

		return true;
	}
	
	public void disconnect()
	{
		isConnected = false;
	}
	
	public void sendPacket(ServerPackets type)
	{
		sendPacket(new byte[] { 0x01, 0x00, (byte)type.getValue() });
	}
	
	public void sendPacket(ServerPackets type, byte[] data)
	{
	    ByteArrayOutputStream os = new ByteArrayOutputStream();
	    os.write((byte)data.length + 1);
	    os.write((byte)type.getValue());
	    try {
	    	os.write(data);		
	    	sendPacket(os.toByteArray());
	    	os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void sendPacket(byte[] data)
	{
		try 
		{
			if(data != null && isConnected)
			{
				this.send.write(data);
				System.out.println("Sent");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private void updateLoop(){
		while(isConnected)
		{
			try 
			{
				byte[] bla = new byte[2];
				this.receive.read(bla, 0, 2);
				ByteBuffer bb = ByteBuffer.allocate(2);
				bb.order(ByteOrder.LITTLE_ENDIAN);
				bb.put(bla[0]);
				bb.put(bla[1]);
				short len = bb.getShort(0);
				byte[] content = new byte[len];
				this.receive.read(content);
				System.out.println("Packet Recived");
				System.out.println(content.length);
				System.out.println(content);
				onCommand(content);
				
			} 
			catch (IOException e)
			{
				disconnect();
				e.printStackTrace();
			}
		}
		try
		{
			disconnect();
			this.send.close();
			this.receive.close();
			this.connection.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void onCommand(byte[] raw)
	{
		//do packet handling here
		ClientPackets cmd = ClientPackets.fromInt(raw[0]);
		System.out.println(cmd.toString());
	}
}
