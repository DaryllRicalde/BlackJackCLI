/*
 * A Person can:
 * 	- draw a card
 * 	- stand
 * 
 * A person has a hand
 * 
 */
public abstract class Person {
	private Hand hand;
	private String name;
	private double money;
	
	public Person(String name) {
		this.name = name;
		this.money = 500.0;		// let any normal person start with 500 dollars
		this.hand = new Hand();
	}
	
	public Person(double money) {
		this.money = money;
		this.hand = new Hand();
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.money;
	}
	
	public Hand getHand() {
		return this.hand;
	}
	
	// draw - remove card from deck and add to hand
	public void draw(Deck deck) {
		Card card = deck.removeCard();		// Draw a random card from the deck
		this.hand.addToHand(card);
	}
	
}
