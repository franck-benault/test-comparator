package net.franckbenault.comparator.v4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.naturalOrder;

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
		//playerList.sort(Comparator.comparing(Player::getDisplayName));
		
		//beter with static import
		//playerList.sort(comparing(Player::getDisplayName));

		
		//playerList.sort(comparing(Player::getDisplayName).reversed());
	
		//playerList.sort(comparingInt(Player::getGamesPlayed));

		//playerList.sort(comparingDouble(Player::getRating).reversed());
		
		//nickname may be null -> null pointer exception
		//playerList.sort(comparing(Player::getNickname));
		
		//still null pointer exception
		//playerList.sort(nullsFirst(comparing(Player::getNickname)));
	
		//everybody wants to be spock
		//playerList.sort(comparing(Player::getNickname,nullsFirst(naturalOrder())));
		
		//playerList.sort(comparing(Player::getNickname,nullsFirst(naturalOrder()))
		//		.thenComparing(Player::getDisplayName));

		playerList.sort(new TwoLevelComparatorBAD()::compare);
	}
	
}
