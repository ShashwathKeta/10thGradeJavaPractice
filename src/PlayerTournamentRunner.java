import java.util.List;

public class PlayerTournamentRunner {
	
	public static void print(Player[] list, List<String >waitingList) {
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				break;
			}
			System.out.println("Player Number: " + i + ". " + "Name: " + list[i].getName() + " Number: " + list[i].getPlayerNumber());
		}
		
		for(int j = 0; j<waitingList.size(); j++) {
			
			System.out.println("Waiting Player Number: " + j + ". Name: " + waitingList.get(j));
		}
	}



	public static void main(String[] args) {
		
		
		TestAddPlayes();
		TestSetMaxPlayers();
		TestAddMaxPlusOne();
		Test2WaitingListPlayesr();
		TestRemovePlayer();
		TestUnRegisteredPlayer();

		
/*		
		
		try {
			obj.cancelAndReassignSlot(johnSmith);
		} catch (PlayerNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Player Not Found");
		}
		obj.requestSlot("Newb");
		
		try {
			obj.cancelAndReassignSlot(dubbaBox);
		} catch (PlayerNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Player Not Found");
		}
		
		try {
			obj.cancelAndReassignSlot(bob);
		} catch (PlayerNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Player Not Found");
		}
		
		System.out.println("\nAfter Draw Change \n");
		
		print(list,waitingList);*/
	}
	
	static void TestAddPlayes() {
		System.out.println("Testing Add players");
		System.out.println("-------------------");
		
		PlayerTournament obj = new PlayerTournament(4);
		
		Player johnSmith = obj.requestSlot("John Smith");
		Player shreshtaDubba = obj.requestSlot("Shreshta Dubba");
		Player shashwathKeta = obj.requestSlot("Shashwath Keta");
		Player dubbaBox = obj.requestSlot("Dubba Box");
		Player billyBob = obj.requestSlot("Billy Bob");
		Player jimmySloper = obj.requestSlot("Jimmy Sloper");
		
		Player[] list = obj.getPlayerList();
		List<String> waitingList= obj.getWaitingList();
		
		print(list,waitingList);
		
		Player bob = new Player("bob", 5);
	}
	
	static void TestSetMaxPlayers(){

		System.out.println("Testing max players");
		System.out.println("-------------------");
		
		int maxplayers = 3;
		
		PlayerTournament obj = new PlayerTournament(maxplayers);
		Player johnSmith = obj.requestSlot("John Smith");
		Player shreshtaDubba = obj.requestSlot("Shreshta Dubba");
		Player shashwathKeta = obj.requestSlot("Shashwath Keta");
		Player dubbaBox = obj.requestSlot("Dubba Box");
		Player billyBob = obj.requestSlot("Billy Bob");
		Player jimmySloper = obj.requestSlot("Jimmy Sloper");
		
		Player[] list = obj.getPlayerList();
		List<String> waitingList= obj.getWaitingList();
		
		print(list,waitingList);
	}
	
	static void TestAddMaxPlusOne() {
		
	}
	
	static void Test2WaitingListPlayesr() {
		
	}
	
	static void TestRemovePlayer() {
		
	}
	
	static void TestUnRegisteredPlayer() {
		
	}
}
