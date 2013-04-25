package tournament;

import java.util.ArrayList;

public class Match {

	public int bracket;
	public ArrayList<Long> competitors;
	public String roomName;
	public Boolean isRoomOpen = false;
	public Long winnerId;
	public Boolean hasMatchStarted = false;
	public Boolean isMatchFinished = false;
}
