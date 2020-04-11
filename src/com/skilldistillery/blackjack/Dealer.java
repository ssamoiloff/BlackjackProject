package com.skilldistillery.blackjack;

public class Dealer extends Player {
	
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();	
	}
	@Override
	protected BlackjackHand getHand() {
		return null;
	}

}
