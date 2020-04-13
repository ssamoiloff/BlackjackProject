### Week 4 Skill Distillery - Blackjack Project

# Overview
This program emulates a game of Blackjack with a single player and a dealer.


Upon launching the program, the user is greeted with a welcome banner. The game logic creates the dealer in the background (which also creates and shuffles a deck) and prompts the user to enter their player's name. Once that input is provided, the player is created and both the dealer and player are dealt their hand of cards. Before the dealer deals itself its second card, the player's hand is checked for a Blackjack condition. If true, the game is ended and the player's hand is displayed, along with a message showing the Blackjack. If false, the dealer deals itself its second card and its hand is then checked for the same Blackjack condition.
	
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ 
	♡ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ 
	♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣                               ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♢
	♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡       WELCOME                 ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♡
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠               TO              ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♠
	♢ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡                  BLACKJACK    ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♢
	♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣                               ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♣
	♡ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ 
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ 
	
	
	Enter name for Player 1: Ally
	
	Ally's hand:	 [Queen of Hearts, Ace of Hearts] ( Total: 21 )
	
	
		♢♣♡♠♢♣♡♠~~~* BLACKJACK!!! Ally WINS! *~~~♠♡♣♢♠♡♣♢
	
					**** GAME OVER ****
	
The beginning of the game displays both the dealer's and the player's hands, though the dealer's first card is hidden. This card is only revealed after the player is finished with their turn. The player is prompted whether to Hit or Stay. If the player hits, a message displays their choice, their updated hand is printed to the screen, and they are prompted once again to make they choice whether to Hit or Stay, provided they don't bust. If the player busts, a message displaying their player name along with "BUSTS!" is printed, and their turn is over. The player may hit as many times as they wish until they either decide to stay, or they bust. Their updated hand is printed after every Hit.


Once the player's turn is over, both the dealer's and player's hands are printed and the dealer's turn begins. If the dealer's hand value is 17 or above, they will stay. If its value is less than 17, they will automatically choose to hit until that value is greater than or equal to 17, or they bust. The dealer's choices are printed in the same way that the player's are.


The player's win condition is: if their hand value is greater than the dealer's and they don't bust, or the dealer busts and they don't, they win. Otherwise, the dealer (house) wins in every other scenario.

	
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ 
	♡ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ 
	♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣                               ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♢
	♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡       WELCOME                 ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♡
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠               TO              ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♠
	♢ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡                  BLACKJACK    ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♢
	♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣                               ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♣
	♡ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ 
	♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♢ ♣ ♡ ♠ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ ♠ ♡ ♣ ♢ 
	
	
	Enter name for Player 1: Ally
	
	Dealer's hand:	 [*HIDDEN*, 4 of Hearts] ( Total: ??? )
	Ally's hand:	 [Queen of Diamonds, 10 of Spades] ( Total: 20 )
	
	
	Would Ally like to (H)it or (S)tay? > s
	
			---* Ally STAYS *---
	
	Dealer's hand:	 [3 of Spades, 4 of Hearts] ( Total: 7 )
	Ally's hand:	 [Queen of Diamonds, 10 of Spades] ( Total: 20 )
	
			---* Dealer HITS *---
	
	Dealer's hand:	 [3 of Spades, 4 of Hearts, 9 of Clubs] ( Total: 16 )
	
			---* Dealer HITS *---
	
	Dealer's hand:	 [3 of Spades, 4 of Hearts, 9 of Clubs, 3 of Clubs] ( Total: 19 )
	
			---* Dealer STAYS *---
	
	
			     Ally WINS!
	
	
			  **** GAME OVER ****
	
# Technologies Used
- Java SE13
- Eclipse IDE
- MacOS Terminal
- GitHub/Git

# Lessons Learned
* Trying to use the return value of a method in another class by calling the method *definitely runs that method* inside the class you're calling it in. For instance, attempting to get the boolean result of whether a player chooses to hit or not by calling that method from my game logic class put me in a situation where I was running code twice when I intended to only run it once. Even though it's obvious now, this was major headache for me.


* This was the first time I chose to use the Scanner in a static way, and it helped to strengthen my understanding of how static fields work inside Java.


* This was also the first time I chose to use Unicode characters, which familiarized me with them a bit more.


* This project gave me a much better understanding of encapsulation and when to make fields and methods private/public/protected. This understanding has helped a lot when navigating all the classes and methods within this program.


* Perhaps one of the most important lessons learned for me: don't be married to your code. There were times where I had to make the decision to totally ditch my approach and start over on some parts, and other times where I realized there was a better way to go about things, so I chose to make those changes.


* This project was a behemoth compared to the previous ones I've built so far. It was a pleasure and a headache at the same time, and I'm excited to push on to bigger things.