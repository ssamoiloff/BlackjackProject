package com.skilldistillery.blackjack;

public abstract class Player {
	protected String name;

	public Player() {}
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract BlackjackHand getHand();
}
