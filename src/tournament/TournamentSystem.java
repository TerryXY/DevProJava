package tournament;

import gui.GUIManager;
import app.AppGlobals;

public class TournamentSystem {
	
	public static void updateTournamentListbox(){
		//GUIManager.listboxOpenTournament
		Tournament test = new Tournament();
		test.id = 1;
		test.name = "abc";
		test.currentBracket = 1;
		AppGlobals.tournamentList.add(test);
		
	}

}
