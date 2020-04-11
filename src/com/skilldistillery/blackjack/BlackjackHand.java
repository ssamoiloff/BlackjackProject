package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	
	public BlackjackHand() {
	}
	
	@Override
	public int getHandValue() {
		
		return 0;
	}
	
	public boolean isBlackjack() {
		return false;
	}
	
	public boolean isBust() {
		return false;
	}
	
	
}
