
public class Card {
	
	String suit;
	String rankName;
	int rankValue;
	
	public Card(String suit, String rankName, int rankValue) {
		this.suit = suit;
		this.rankName = rankName;
		this.rankValue = rankValue;
	}
	
	public Card() {
		this.suit = null;
		this.rankName = null;
		this.rankValue = -1;
	}
	
	
	public String getSuit() {
		return this.suit;
	}
	
	public String getRankName() {
		return this.rankName;
	}
	
	public int getRankValue() {
		return this.rankValue;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public void setRankValue(int rankValue) {
		this.rankValue = rankValue;
	}
	
	
}
