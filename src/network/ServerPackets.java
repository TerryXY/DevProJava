package network;

public enum ServerPackets { GameList(0), Kill(1), Kick(2), Ping(3), Login(4), Register(5);
private int value;

private ServerPackets(int value) 
{
        this.value = value;
}
public int getValue()
{
	return value;
}
public static ServerPackets fromInt(int code) {
	
	switch(code) 
	{
		case 0:
			return GameList;
		case 1:
			return Kill;
		case 2:
			return Kick;
		case 3:
			return Ping;
		case 4:
			return Login;
		case 5:
			return Register;
		}
	return null;
}

}
