package net.franckbenault.comparator.v4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class PlayerDemo {

	public static void main(String[] args) {
		List<Player> playerList = Player.getPlayerList();
		Collections.shuffle(playerList, new Random(24456));
		sortDemo(playerList);
		System.out.println(Player.getHeader());
		
		playerList.forEach(System.out::println);

	}

	public static void sortDemo(List<Player> playerList) {
		
		//playerList.sort((a,b) -> a.getDisplayName().compareTo(b.getDisplayName()));
		
		//beter 
		playerList.sort(Comparator.comparing(Player::getDisplayName));
		
	}
}
