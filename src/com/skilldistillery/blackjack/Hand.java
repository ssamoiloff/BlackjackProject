package com.skilldistillery.blackjack;

import java.util.List;

public abstract class Hand {
	protected List<Card> cards;
	
	public Hand() {}
	
	public void addCard() {
		
	}
	
	public void clear() {
		
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	
}
