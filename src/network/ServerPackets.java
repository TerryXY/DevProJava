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

}
