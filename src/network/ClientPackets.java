package network;

public enum ClientPackets 
{ 
	GameList(0),RemoveRoom(1),UpdatePlayers(2),LoginAccepted(3),LoginFailed(4),
    ServerMessage(5),Banned(6),Kicked(7),RegisterAccept(8),RegisterFailed(9),Pong(10),RoomStart(11);
	private int value;
	private ClientPackets(int value) 
	{
        this.value = value;
        }
	public int getValue()
	{
		return value;
	}
	public static ClientPackets fromInt(int code) {
		
		switch(code) 
		{
			case 0:
				return GameList;
			case 1:
				return RemoveRoom;
			case 2:
				return UpdatePlayers;
			case 3:
				return LoginAccepted;
			case 4:
				return LoginFailed;
			case 5:
				return ServerMessage;
			case 6:
				return Banned;
			case 7:
				return Kicked;
			case 8:
				return RegisterAccept;
			case 9:
				return RegisterFailed;
			case 10:
				return Pong;
			case 11:
				return RoomStart;
			}
		return null;
	}
}
