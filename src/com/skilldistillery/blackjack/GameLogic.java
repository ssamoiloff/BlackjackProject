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
				"\n\t" + chstr + chstr + "---* BLACKJACK!!! " + p1.getName() + " WINS! *---" + chstr2 + chstr2);
		System.out.println("\n\t\t\t**** GAME OVER ****");
		System.exit(0);
	}

	public void dealerBj() {
		showDealerHand();
		System.out.println("\n\t" + chstr + chstr + "---* BLACKJACK!!! House wins =( *---" + chstr2 + chstr2);
		System.out.println("\n\t\t\t**** GAME OVER ****");
		System.exit(0);
	}

	public void showHands() {
		showDealerHand();
		showP1Hand();
		System.out.println();
	}

	public void showDealerHand() {
		System.out.println(d.getName() + "'s hand:\t" + d.getDealerHand() +
					" ( Total: " + d.getDealerHand().getHandValue() + " )");
	}

	public void showP1Hand() {
		System.out.println(p1.getName() + "'s hand:\t" + p1.getP1Hand() +
				" ( Total: " + p1.getP1Hand().getHandValue() + " )");
	}

	public void checkDeck() {
		System.out.println("Cards left in deck: " + d.countCards());
	}

	public void playerTurn(Player player) { // args are for future multiplayer support
		boolean hit = player.hit();
		while (hit == true) {
			p1.addCard(d.dealP1Card());
			System.out.println("\n\t---* " + p1.getName() + " HITS *---\n");
			showP1Hand();
			System.out.println();
			if (p1.getP1Hand().isBust() == true) {
				p1Bust();
				hit = false;
				return;
			}
			hit = player.hit();
		}
		if (hit == false) {
			System.out.println("\n\t---* " + p1.getName() + " STAYS *---\n");
		}
		showHands();
	}

	public void dealerTurn() {
		boolean hit = d.hit();
		while (hit == true) {
			d.getCard();
			System.out.println("\n\t---* " + d.getName() + " HITS *---\n");
			showDealerHand();
			if (d.getDealerHand().isBust() == true) {
				dealerBust();
				hit = false;
			}
		}
		if (hit == false) {
			System.out.println("\n\t---* " + d.getName() + " STAYS *---\n");
		}
		showHands();
	}

	public void p1Bust() {
		System.out.println("\n\t---* " + p1.getName() + " BUSTS! *---\n");
	}
	
	public void dealerBust() {
		System.out.println("\n\t---* " + d.getName() + " BUSTS! *---\n");
		p1Wins();
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
		if (p1.getP1Hand().getHandValue() > d.getDealerHand().getHandValue()) {
			p1Wins();
		} else {
			dealerWins();
		}
	}

	public Dealer getD() {
		return d;
	}

	public PlayerOne getP1() {
		return p1;
	}

}
