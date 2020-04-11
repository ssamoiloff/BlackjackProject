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
		p1.addCard(d.dealP1Card());
		d.getCard();
		p1.addCard(d.dealP1Card());
		d.getCard();
	}
	
	public void showHands() {
		System.out.println(d.getName() + ": " + d.getDealerHand());
		System.out.println(p1.getName() + ": " + p1.getP1Hand());
	}
	
	public void showDealerHand() {
		System.out.println(d.getName() + ": " + d.getDealerHand());
	}
	
	public void showP1Hand() {
		System.out.println(p1.getName() + ": " + p1.getP1Hand());
	}
	
	public void checkDeck() {
		System.out.println("Cards left in deck: " + d.countCards());
	}
	
	public void hitOrStay(Player player) {
		boolean hit = player.hit();
		
		if (player.equals(p1)) {
			if (hit == true) {
				p1.addCard(d.dealP1Card());
				System.out.println("\n\t---* " + p1.getName() + " HITS *---\n");
			}
			else if (hit == false){
				System.out.println("\n\t---* " + p1.getName() + " STAYS *---\n");
			}
			showHands();
		}
		else if (player.equals(d)) {
			if (hit == true) {
				d.getCard();
				System.out.println("\n\t---* " + d.getName() + " HITS *---\n");
			}
			else if (hit == false){
				System.out.println("\n\t---* " + d.getName() + " STAYS *---\n");
			}
			showHands();
		}
	}
}
