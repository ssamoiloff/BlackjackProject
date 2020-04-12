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
		gl.dealerWins();
//		gl.dealCards();
//		gl.showHands();
//		gl.hitOrStay(p1);
//		gl.hitOrStay(d);
	}
}
