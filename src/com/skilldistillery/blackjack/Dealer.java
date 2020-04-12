package com.skilldistillery.blackjack;

public class Dealer extends Player {
	
	private Deck deck;
	private BlackjackHand dealerHand = new BlackjackHand();
	private final String name = "Dealer";
	
	public Dealer() {
		deck = new Deck();
		deck.shuffle();
		deck.shuffle();
	}
	
	public String getName() {
		return name;
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
	
	public int countCards() {
		return deck.checkDeckSize();
	}

	@Override
	protected boolean hit() {
		if (dealerHand.getHandValue() < 17) {
			return true;
		}
		else {
			return false;
		}
	}

}
