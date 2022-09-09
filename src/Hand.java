/*
 * To represent the cards the player and the dealer are holding, and get the total value of the cards in their hand
 */

import java.util.ArrayList;

public class Hand {
	
	// A Hand may hold many cards if the dealer and player wishes 
	// to draw more than once
	
	ArrayList<Card> cards = new ArrayList<Card>();
		
	public void addToHand(Card card) {
		this.cards.add(card);
	}
	
	public int handTotal() {
		int sum = 0;
		for(Card c : cards) {
			sum += c.getRankValue();
		}
		return sum;
	}
	
	public void printHand() {
		for(Card c : this.cards) {
			System.out.println(c.getRankName() + " of " + c.getSuit());
		}
	}
	
}
