
public class Deck {
	final int CARDS_COUNT = 52; 
	private String cardExample;
	
	// a Deck will have a collection of 52 cards
	//	TODO: 
	//		shuffle() => Shuffle the deck, is this really needed?
	//		draw() => draw a card from the deck, maybe this is a Human class func?
	
	public Deck() {
		cardExample = "King";
	}
	
	public int getCardCount() {
		return CARDS_COUNT;
	}
	
	public String getCard() {
		return cardExample;
	}
}
