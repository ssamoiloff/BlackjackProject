package com.skilldistillery.blackjack;

public class GameLogic {
	Dealer d;
	PlayerOne p1;
	
	
	public GameLogic() {
		createPlayers();
	}
	
	public void createPlayers() {
		d = new Dealer();
		p1 = new PlayerOne();
	}
	
	public void dealCards() {
		d.getCard();
		p1.addCard(d.dealP1Card());
		d.getCard();
		p1.addCard(d.dealP1Card());
	}
	
	public void showHands() {
		System.out.println("Dealer: " + d.getDealerHand());
		System.out.println("Player 1: " + p1.getP1Hand());
	}
}
