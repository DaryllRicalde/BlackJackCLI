/*
 * Rules of Blackjack
 * 
 * In our game, the player duels the dealer
 * WIN by beating the dealer at getting as close to 21 as possible without going over 21 because otherwise you bust
 * 
 * -----------
 * Card values
 * 	Normal cards 	=> As they are 
 * 	Face cards 		=> 10 
 * 	Ace 			=> 1 or 11 depending on whatever makes the hand closer to 21 without going over
 * ------------
 * 
 * The Game (no betting)
 * ----------------
 * 1st phase
 * - The player gets two cards
 * - The dealer gets one card face up and another face down
 * 2nd phase (immediate wins)
 * 
 * IF the dealer starts with 21, the player loses automatically before they even get a chance to hit or stand
 * IF the player gets 21 and the dealer does not, he hits blackjack and immediately wins
 * IF they both get 21, its a draw
 * 
 * 3rd phase
 * - The player can draw a card from the deck but if they go over 21, they bust and lose
 * - If the player stands, they end their turn and the dealer begins drawing
 * - The dealer will keep drawing cards until they reach a hand valued at 17 or higher
 * 
 * 4th phase (player stands, and dealer has finished drawing)
 * - If neither player nor dealer busts, the player with the highest score wins
 * - (unlikely) if the cards were to run out, the deck is shuffled
 */

import java.util.ArrayList;

public class Game {
	private Player player;
	private Dealer dealer;
	private Deck deck;
	private ArrayList<Person> personsPlaying = new ArrayList<Person>();
	
	public Game(Player player) {
		this.player = player;
		this.dealer = new Dealer(50000);
		personsPlaying.add(dealer);
		this.deck = new Deck();
	}
	
	public void start() {
		System.out.println("Hi " + player.getName() + ", welcome to BlackJack");
		for(int i = 0; i < 2; i++) {
			for(Person p : personsPlaying) {
				System.out.println(p.getName());
				p.draw(this.deck);
			}
		}
		
		//moneyStatus();
		//deck.printCards();
		//deck.removeCard();
		System.exit(0);
	}
	
	public void printPlayersHands() {
		for(Person p : personsPlaying) {
			p.getHand().printHand();
		}
	}
	
	// Check dealer's and player's money
	public void moneyStatus() {
		for(Person p : personsPlaying) {
			System.out.println(p.getName() + " has " + "$"+p.getBalance());
		}
	}
	
	// add a player to the table
	public void addPlayer(Person p) {
		personsPlaying.add(p);
	}
}
