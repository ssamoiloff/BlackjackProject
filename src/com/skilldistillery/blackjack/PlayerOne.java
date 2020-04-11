package com.skilldistillery.blackjack;

public class PlayerOne extends Player {
	
	private BlackjackHand p1Hand = new BlackjackHand();
	
	public PlayerOne() {}
	
	public PlayerOne(String name) {
		super(name);
	}

	public void addCard(Card card) {
		p1Hand.addCard(card);
	}

	public BlackjackHand getP1Hand() {
		return p1Hand;
	}

}
