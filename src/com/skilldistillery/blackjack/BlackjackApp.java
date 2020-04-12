package com.skilldistillery.blackjack;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.launch();
	}
	private void launch() {
		GameLogic gl = new GameLogic();
		Player d = gl.getD();
		Player p1 = gl.getP1();
		
		gl.dealCards();
		gl.showHands();
		gl.playerTurn(p1);
		gl.dealerTurn();
	}
	
	/*
	 * -Fix win logic-
	 * If player busts, dealer wins after STAY.
	 * If dealer > player, dealer wins.
	 * TEST A BUNCH
	 * 
	 */
}
