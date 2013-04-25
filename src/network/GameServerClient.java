package network;
import java.io.*;
import java.net.*;

public class GameServerClient extends Thread
{
	Socket connection = null;
	DataInputStream receive = null;
	DataOutputStream send = null;
	Boolean isConnected = false;
	
	
	
	public boolean Connect(String server,int port)
	{
		try
		{
			connection = new Socket(server,port);
		}
		catch(UnknownHostException e)
		{
			System.out.println("");
			return false;
		}
		catch(IOException e)
		{
			System.out.println("Failed to connect to " + server);
			return false;
		}
		
		
		
		try 
		{
			receive = new DataInputStream(connection.getInputStream());
			send = new DataOutputStream(connection.getOutputStream());
		} catch (IOException e) 
		{
			e.printStackTrace();
			return false;
		}
		isConnected = true;
		start();
		System.out.println("Connected to " + server + " Port: " + port);
		return true;
	}
	
	public void Disconnect()
	{
		isConnected = false;
	}
	public void SendPacket(ServerPackets type)
	{
		SendPacket(new byte[] { 0x01, 0x00, (byte)type.getValue() });
	}
	public void SendPacket(ServerPackets type, byte[] data)
	{
	    ByteArrayOutputStream os = new ByteArrayOutputStream();
	    os.write((byte)data.length + 1);
	    os.write((byte)type.getValue());
	    try {
	    	os.write(data);		
	    	SendPacket(os.toByteArray());
	    	os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void SendPacket(byte[] data)
	{
		try 
		{
			send.write(data);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		while(isConnected)
		{
			try 
			{
				int len = receive.readInt();
				byte[] content = new byte[len];
				receive.read(content, 0, content.length);
				
				System.out.println("Packet Recived");
				OnCommand(content);
				
			} 
			catch (IOException e)
			{
				Disconnect();
				e.printStackTrace();
			}
		}
		try
		{
			Disconnect();
			send.close();
			receive.close();
			connection.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void OnCommand(byte[] raw)
	{
		//do packet handling here
	}
}
