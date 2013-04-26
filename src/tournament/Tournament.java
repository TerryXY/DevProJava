package tournament;

import gui.GUIManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JLabel;

public class Tournament {
	
	public String name;
	public long id;
	public ArrayList<Competitor> competitors = new ArrayList<Competitor>();
	public TournamentStatusType status;
	public int maxCompetitors = 8;
	public float nextDuelTimer;
	public float timeLefToJoinTimer;
	public int currentBracket = 1;
	public ArrayList<Match> matchList = new ArrayList<Match>();
	public ArrayList<JLabel> currentBracketLabels;
	
	public void addCompetitor(Competitor user){
		if(competitors != null && competitors.size() < maxCompetitors){
			competitors.add(user);
			setPositionLabel(1, competitors.size() + 1, user.userName);
		}
	}
	
	public void removeCompetitor(Competitor user){
		if(competitors != null && !competitors.isEmpty()){
			competitors.remove(user);
			setPositionLabel(1, user.position, "Open");
		}
	}
	
	public void addMatch(Match match){
		if(matchList != null && !matchList.isEmpty()){
			matchList.add(match);
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

			Iterator<Competitor> it = competitors.iterator();
			while(it.hasNext()) {
				Object element = it.next();
				System.out.print(element + " ");
			}
		}
	
	}
	
	public void nextBracket(){
		if(this.currentBracket < 4){
			this.currentBracket++;
		}
	}
	
	
	
	public void initCompetitorBoard(){

		GUIManager.lblTournFirstCompetitor1.setText("Open");
		GUIManager.lblTournFirstCompetitor2.setText("Open");;
		GUIManager.lblTournFirstCompetitor3.setText("Open");;
		GUIManager.lblTournFirstCompetitor4.setText("Open");;
		GUIManager.lblTournFirstCompetitor5.setText("Open");;
		GUIManager.lblTournFirstCompetitor6.setText("Open");;
		GUIManager.lblTournFirstCompetitor7.setText("Open");;
		GUIManager.lblTournFirstCompetitor8.setText("Open");;	
		GUIManager.lblTournSecondCompetitor1.setText("Open");;
		GUIManager.lblTournSecondCompetitor2.setText("Open");;
		GUIManager.lblTournSecondCompetitor3.setText("Open");;
		GUIManager.lblTournSecondCompetitor4.setText("Open");;		
		GUIManager.lblTournThirdCompetitor1.setText("Open");;
		GUIManager.lblTournThirdCompetitor2.setText("Open");;
		GUIManager.lblTournFinalCompetitor1.setText("Open");;


	}


public void setPositionLabel(int bracket, int position, String text){
		
		if(bracket == 1){
			switch(position){
				case 1:
					GUIManager.lblTournFirstCompetitor1.setText(text);
					break;
				case 2:
					GUIManager.lblTournFirstCompetitor2.setText(text);
					break;
				case 3:
					GUIManager.lblTournFirstCompetitor3.setText(text);
					break;
				case 4:
					GUIManager.lblTournFirstCompetitor4.setText(text);
					break;
				case 5:
					GUIManager.lblTournFirstCompetitor5.setText(text);
					break;
				case 6:
					GUIManager.lblTournFirstCompetitor6.setText(text);
					break;
				case 7:
					GUIManager.lblTournFirstCompetitor7.setText(text);
					break;
				case 8:
					GUIManager.lblTournFirstCompetitor8.setText(text);
					break;
			}
			
		}else if(bracket == 2){
			switch(position){
				case 1:
					GUIManager.lblTournSecondCompetitor1.setText(text);
					break;
				case 2:
					GUIManager.lblTournSecondCompetitor2.setText(text);
					break;
				case 3:
					GUIManager.lblTournSecondCompetitor3.setText(text);
					break;
				case 4:
					GUIManager.lblTournSecondCompetitor4.setText(text);
					break;
			}
			
		}else if(bracket == 3){
			switch(position){
				case 1:
					GUIManager.lblTournThirdCompetitor1.setText(text);
					break;
				case 2:
					GUIManager.lblTournThirdCompetitor2.setText(text);
					break;
			}
			
		}else if(bracket == 4){
			switch(position){
				case 1:
					GUIManager.lblTournFinalCompetitor1.setText(text);
					break;
			}
			
		}
		
	}
	

}
