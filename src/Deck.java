
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	String[] suits = {"Spade","Clubs","Hearts","Diamond"};
	String[] faces = {"King", "Queen", "Jack", "Ace"};
	ArrayList<Card> cards = new ArrayList<Card>();
	
	// a Deck will have a collection of 52 cards
	//	TODO: 
	//		shuffle() => Shuffle the deck, is this really needed?
	//		draw() => draw a card from the deck, maybe this is a Human class func?
	
	public Deck() {
		// for normal cards
		for(int j = 0; j < suits.length; j++) {
			for(int i = 2; i < 11; i++) {
				addCard(suits[j], Integer.toString(i), i);
			}
			
			// for face cards including Ace
			for(String f : faces) {
				int val;
				if(!(f.contentEquals("Ace"))) {
					val = 10;
				}
				else {
					val = 11;
				}
				addCard(suits[j], f, val);
			}
		}
	}
	
	public void printCards() {
		for(Card c : cards) {
			System.out.println(c.getRankName() + " of " + c.getSuit() + " " + c.getRankValue());
		}
	}

	public void addCard(String suit,String rankName, int rankValue) {
		Card card = new Card(suit,rankName,rankValue);
		this.cards.add(card);
	}
	
	// get a random card from the deck and remove it
	public Card removeCard() {
		Random rand = new Random();
		int rand_index = rand.nextInt(cards.size());	// generate a random index
		Card card = cards.get(rand_index);				// remove the Card corresponding to that index
//		System.out.println("Removing Card: " + card.getRankName() + " of " +  card.getSuit());
		cards.remove(rand_index);
//		System.out.println("Remaining cards: " + getCardCount());
		return card;
	}
	
	public int getCardCount() {
		return this.cards.size();
	}
	
}
