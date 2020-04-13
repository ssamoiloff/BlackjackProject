package com.skilldistillery.blackjack;

public class BlackjackApp {
	private final String d = ""+GameLogic.wD;
	private final String c = ""+GameLogic.bC;
	private final String h = ""+GameLogic.wH;
	private final String s = ""+GameLogic.bS;
	private final String s1 = h+" "+s+" "+d+" "+c+" ";
	private final String s2 = s+" "+d+" "+c+" "+h+" ";
	private final String s3 = d+" "+c+" "+h+" "+s+" ";
	private final String s4 = c+" "+d+" "+s+" "+h+" ";
	private final String s5 = d+" "+s+" "+h+" "+c+" ";
	private final String s6 = h+" "+c+" "+d+" "+s+" ";
	private final String s7 = s+" "+h+" "+c+" "+d+" ";
	private final String[] arr1 = {d,c,h,s};
	private final String[] arr2 = {c,h,s,d};
	
	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.printTop();
		bja.printBanner();
		bja.printBottom();
		bja.launch();
	}
	private void launch() {
		GameLogic gl = new GameLogic();
		Player p1 = gl.getP1();
		
		gl.dealCards();
		gl.showHandsInitial();
		gl.playerTurn(p1);
		gl.dealerTurn();
	}
	
	private void printTop() {
		System.out.print(s+" ");
		for (int i = 0; i < 4; i++) {
			for (int suit = 0; suit < 4; suit++) {
				System.out.print(arr1[suit]+" ");
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int suit = 3; suit >= 0; suit--) {
				System.out.print(arr1[suit]+" ");
			}
		}
		System.out.println();
		System.out.print(h+" ");
		for (int i = 0; i < 4; i++) {
			for (int suit = 0; suit < 4; suit++) {
				System.out.print(arr2[suit]+" ");
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int suit = 3; suit >= 0; suit--) {
				System.out.print(arr2[suit]+" ");
			}
		}
		System.out.println();
	}
	private void printBottom() {
		System.out.print(h+" ");
		for (int i = 0; i < 4; i++) {
			for (int suit = 0; suit < 4; suit++) {
				System.out.print(arr2[suit]+" ");
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int suit = 3; suit >= 0; suit--) {
				System.out.print(arr2[suit]+" ");
			}
		}
		System.out.println();
		System.out.print(s+" ");
		for (int i = 0; i < 4; i++) {
			for (int suit = 0; suit < 4; suit++) {
				System.out.print(arr1[suit]+" ");
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int suit = 3; suit >= 0; suit--) {
				System.out.print(arr1[suit]+" ");
			}
		}
		System.out.println("\n\n");
	}
	
	private void printBanner() {	
		System.out.println(c+" "+s1+s1+"                              "+s6+s6+d);
		System.out.println(h+" "+s2+s2+"      WELCOME                 "+s7+s7+h);
		System.out.println(s+" "+s3+s3+"              TO              "+s5+s5+s);
		System.out.println(d+" "+s4+s4+"                 BLACKJACK    "+s4+s4+d);
		System.out.println(c+" "+s5+s5+"                              "+s6+s6+c);
	}
}
