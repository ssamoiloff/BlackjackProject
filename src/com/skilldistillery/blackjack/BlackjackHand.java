package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	
	public BlackjackHand() {
	}
	
	@Override
	public int getHandValue() {
		int handValue = 0;
		for (int card = 0; card < cards.size(); card++) {
			handValue += cards.get(card).getValue();
		}
		return handValue;
	}
	
	public boolean isBlackjack() {
		if (cards.size() == 2 && getHandValue() == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
