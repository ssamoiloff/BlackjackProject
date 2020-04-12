package com.skilldistillery.blackjack;

public class PlayerOne extends Player {
	
	private BlackjackHand p1Hand = new BlackjackHand();
	private String name;

	public PlayerOne() {
	}

	public PlayerOne(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCard(Card card) {
		p1Hand.addCard(card);
	}

	public BlackjackHand getP1Hand() {
		return p1Hand;
	}

	@Override
	protected boolean hit() {
		boolean hit = false;
		String input;
		
		System.out.print("Would " + name + " like to (H)it or (S)tay? > ");
		input = GameLogic.kb.nextLine();
		if (input.equalsIgnoreCase("h") || input.equalsIgnoreCase("hit")) {
			return true;
		} else if (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("stay")) {
			return false;
		} else {
			return hit;
		}
	}

}
