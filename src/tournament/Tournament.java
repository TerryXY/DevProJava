package tournament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Tournament {
	
	public String name;
	public long id;
	public ArrayList<Long> competitors = new ArrayList<Long>();
	public TournamentStatusType status;
	public int maxCompetitors = 8;
	public float nextDuelTimer;
	public float timeLefToJoinTimer;
	public int currentBracket;
	public ArrayList<Match> matchList;
	
	
	public void addCompetitor(long userId){
		if(competitors != null && competitors.size() < maxCompetitors){
			competitors.add(userId);
		}
	}
	
	public void removeCompetitor(long userId){
		if(competitors != null && !competitors.isEmpty()){
			competitors.remove(userId);
		}
	}
	
	public void initMatchList(){
		
		Random rand = new Random();
		int min = 1;
		int max = maxCompetitors;
		Long[] matched;
		
		for(int i = 0; i <= maxCompetitors / 2; i++) {
			Match match = new Match();
			match.bracket = currentBracket;
			match.hasMatchStarted = false;
			match.isMatchFinished = false;
			match.isRoomOpen = false;
			
			int randomNum = rand.nextInt(max - min + 1) + min;

			Iterator<Long> it = competitors.iterator();
			while(it.hasNext()) {
				Object element = it.next();
				System.out.print(element + " ");
			}
		}
	
	}
	
	public void updateCompetitorBoard(){
		if(competitors != null && !competitors.isEmpty()){
			
		}
	}


}
