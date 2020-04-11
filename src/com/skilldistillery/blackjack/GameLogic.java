package com.skilldistillery.blackjack;

public class GameLogic {
	Dealer d;
	PlayerOne p1;
	
	
	public GameLogic() {
		createPlayers();
	}
	
//	public void printDeck() {
//		System.out.println(deck.toString());
//	}
	
	public void createPlayers() {
		d = new Dealer();
		p1 = new PlayerOne();
	}
	
}
