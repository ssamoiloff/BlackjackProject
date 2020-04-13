package com.skilldistillery.blackjack;

import java.util.Scanner;

public class GameLogic {
	public static Scanner kb = new Scanner(System.in);
	public static char wD = '\u2662';
	public static char bC = '\u2663';
	public static char wH = '\u2661';
	public static char bS = '\u2660';
	public static String chstr = "" + wD + bC + wH + bS;
	public static String chstr2 = "" + bS + wH + bC + wD;
	private Dealer d;
	private PlayerOne p1;

	public GameLogic() {
		createPlayers();
	}

	public void createPlayers() {
		d = new Dealer();
		System.out.print("Enter name for Player 1: ");
		String name = kb.nextLine();
		System.out.println();
		p1 = new PlayerOne(name);
	}

	public void dealCards() {
		p1.addCard(d.dealP1Card());
		d.getCard();
		p1.addCard(d.dealP1Card());
		if (p1.getP1Hand().isBlackjack()) {
			p1Bj();
		}
		d.getCard();
		if (d.getDealerHand().isBlackjack()) {
			dealerBj();
		}
	}

	public void p1Bj() {
		showP1Hand();
		System.out.println(
				"\n\t" + chstr + chstr + "~~~* BLACKJACK!!! " + p1.getName() + " WINS! *~~~" + chstr2 + chstr2);
		System.out.println("\n\t\t\t**** GAME OVER ****");
		System.exit(0);
	}

	public void dealerBj() {
		showDealerHand();
		System.out.println("\n\t" + chstr + chstr + "~~~* BLACKJACK!!! House wins =( *~~~" + chstr2 + chstr2);
		System.out.println("\n\t\t\t**** GAME OVER ****");
		System.exit(0);
	}

	public void showHandsInitial() {
		showDealerHandInitial();
		showP1Hand();
		System.out.println();
	}

	public void showHands() {
		showDealerHand();
		showP1Hand();
	}

	public void showDealerHandInitial() {
		System.out.println(d.getName() + "'s hand:\t " + d.getDealerHand().oneCardHidden() + " ( Total: ??? )");
	}

	public void showDealerHand() {
		System.out.println(d.getName() + "'s hand:\t" + d.getDealerHand() + " ( Total: "
				+ d.getDealerHand().getHandValue() + " )");
	}

	public void showP1Hand() {
		System.out.println(
				p1.getName() + "'s hand:\t" + p1.getP1Hand() + " ( Total: " + p1.getP1Hand().getHandValue() + " )");
		System.out.println();
	}

	public void playerTurn(Player player) { // args are for future multiplayer support
		boolean hit = player.hit();
		
		while (hit == true) {
			p1.addCard(d.dealP1Card());
			System.out.println("\n\t---* " + p1.getName() + " HITS *---\n");
			if (p1.getP1Hand().isBust() == true) {
				p1Bust();
				hit = false;
				return;
			}
			showP1Hand();
			hit = player.hit();
		}
		if (hit == false) {
			System.out.println("\n\t---* " + p1.getName() + " STAYS *---\n");
		}
	}

	public void dealerTurn() {
		int counter = 0;
		showHands();
		boolean hit = d.hit();
		if (hit == true) {counter = 1;}
		
		while (hit == true) {
			d.getCard();
			System.out.println("\t---* " + d.getName() + " HITS *---\n");
			if (d.getDealerHand().isBust() == true) {
				dealerBust();
				hit = false;
				return;
			}
			showDealerHand();
			hit = d.hit();
			System.out.println();
		}
		if (hit == false && counter == 0) {
			System.out.println("\t---* " + d.getName() + " STAYS *---\n");
			showHands();
		}
		if (counter == 1) {
			System.out.println("\t---* " + d.getName() + " STAYS *---\n");
			System.out.println();
		}
		findWinner();
	}

	public void p1Bust() {
		showP1Hand();
		System.out.println("\t---* " + p1.getName() + " BUSTS! *---\n");
	}

	public void dealerBust() {
		showDealerHand();
		System.out.println("\n\t---* " + d.getName() + " BUSTS! *---\n");
	}

	public void dealerWins() {
		System.out.println("\t      HOUSE WINS");
		System.out.println("\n\t  **** GAME OVER ****");
		System.exit(0);
	}

	public void p1Wins() {
		System.out.println("\t     " + p1.getName() + " WINS!\n");
		System.out.println("\n\t  **** GAME OVER ****");
		System.exit(0);
	}

	public void findWinner() {
		int p1total = p1.getP1Hand().getHandValue();
		int dealerTotal = d.getDealerHand().getHandValue();
		
		if (p1.getP1Hand().isBust() == false && d.getDealerHand().isBust() == true) {
			p1Wins();
		}
		else if (p1.getP1Hand().isBust() == true) {
			dealerWins();
		}
		else if (p1total <= dealerTotal) {
			dealerWins();
		}
		else {
			p1Wins();
		}
	}

	public Dealer getD() {
		return d;
	}

	public PlayerOne getP1() {
		return p1;
	}

}
