
public class Dealer extends Person {
	
	String name = "Dealer";
		
	public Dealer(double money) {
		super(money);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
