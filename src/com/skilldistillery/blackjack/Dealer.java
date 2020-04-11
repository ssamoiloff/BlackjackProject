package com.skilldistillery.blackjack;

public class Dealer extends Player {
	
	private Deck deck;
	private BlackjackHand dealerHand = new BlackjackHand();
	
	public Dealer() {
		deck = new Deck();
		deck.shuffle();
		deck.shuffle();
	}
	
	protected void getCard() {
		deck.dealCard(dealerHand);
	}
	
	protected Card dealP1Card() {
		return deck.dealCard();
	}

	public Deck getDeck() {
		return deck;
	}

	public BlackjackHand getDealerHand() {
		return dealerHand;
	}

}
