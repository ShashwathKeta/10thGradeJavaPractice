import java.util.ArrayList;
import java.util.List;

public class PlayerTournament {
	
	private Player[] slots;
	private List<String> waitingList = new ArrayList<String>();
	
	public PlayerTournament(int tourney) {
		slots = new Player[tourney];
	}
	
	public Player requestSlot(String PlayerName) {
		
		for(int i = 0; i < slots.length; i++) {
			if(slots[i] == null) {
				Player p = new Player(PlayerName, i);
				slots[i] = p;
				return p;
			}
		}
		waitingList.add(PlayerName);
		return null;
	}
	
	public Player cancelAndReassignSlot(Player p) throws PlayerNotFoundException{
		int i = p.getPlayerNumber();
		boolean contains = false;
		
		for(int j = 0; j < slots.length; j++) {
			if(slots[j] == p) {
				contains = true;
			}
		}

		if (contains) {
			if (waitingList.size() != 0) {
				slots[i] = new Player(waitingList.get(0), i);
				waitingList.remove(0);
			} else {
				slots[i] = null;
			}
			return slots[i];
		}
		else {
			throw new PlayerNotFoundException("Player was not registered");
		}
	}
	
	public Player[] getPlayerList() {
		return slots;
	}
	public List<String> getWaitingList(){
		return waitingList;
	}
}
