package room;

import java.util.Collection;
import java.util.List;

import config.BanListType;
import config.ModeType;
import config.RuleType;

public class Room {
	
	   public BanListType banListType;
       public int timer;
       public RuleType rule;
       public ModeType mode;

       public Boolean enabledPriority;
       public Boolean isNoCheckDeck;
       public Boolean isNoShuffleDeck;
       public Boolean isRanked;
       public Boolean isLocked;
       public Boolean hasStarted;

       public int startLp;
       public int startHand;
       public int drawCount;

       public String roomName;

       public Collection<Long> playerList;
       public Collection<Long> spectatorList;
       public Long hosterId;
       
       public String pwd;
   

}

