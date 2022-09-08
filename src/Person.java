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
	}
	
	public Person(double money) {
		this.money = money;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.money;
	}
	
	// draw - remove card from deck and add to hand
}
