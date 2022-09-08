
import java.util.ArrayList;

public class Deck {
	final int CARDS_COUNT = 52; 
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
			for(int i = 1; i < 11; i++) {
				addCard(suits[j], Integer.toString(i), i);
			}
			// for face cards including Ace
			for(String f : faces) {
				if(!(f.contentEquals("Ace"))) {
					addCard(suits[j], f, 10);
				}
				else {
					addCard(suits[j], f, 11);
				}
			}
		}
	}
	
	public void printCards() {
		for(Card c : cards) {
			System.out.println(c.getRankName() + " of " + c.getSuit() + " " + c.getRankValue());;
		}
	}

	public void addCard(String suit,String rankName, int rankValue) {
		Card card = new Card(suit,rankName,rankValue);
		this.cards.add(card);
	}
	
	
	public int getCardCount() {
		return CARDS_COUNT;
	}
	
}
