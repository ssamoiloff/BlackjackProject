package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();
	
	public Hand() {
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	
}
