package net.franckbenault.comparator.v4;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String displayName;
	
	//may be null
	private String nickname;
	
	private int gamesPlayed;
	
	private double rating;

	public String getDisplayName() {
		return displayName;
	}

	
	public String getNickname() {
		return nickname;
	}

	
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	
	public double getRating() {
		return rating;
	}


	public static List<Player> getPlayerList() {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Adam", null,10, 0.56));
		players.add(new Player("Adim", "the best",12, 0.54));
		players.add(new Player("Adoum", null,11, 0.57));
		players.add(new Player("Adaman", "spock",15, 0.16));
		players.add(new Player("Adoumin", "spock",1, 0.17));
		
		return players;
	}


	@Override
	public String toString() {
		return String.format("%20s %20s %20d %20f",displayName, nickname,gamesPlayed,rating );
				
				
				//"Player [displayName=" + displayName + ",\tnickname=" + nickname + ",\t\tgamesPlayed=" + gamesPlayed
				//+ ",\trating=" + rating + "]";
	}


	public Player(String displayName, String nickname, int gamesPlayed, double rating) {
		super();
		this.displayName = displayName;
		this.nickname = nickname;
		this.gamesPlayed = gamesPlayed;
		this.rating = rating;
	}


	public static String getHeader() {
		// TODO Auto-generated method stub
		return String.format("%20s %20s %20s %20s","DisplayName","Nickname","#GA","Rate");
	}

	
	

}
