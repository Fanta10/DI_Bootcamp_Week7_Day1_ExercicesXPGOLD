package exercice3;

public class Card {
	 private int rank;
	    private int suit;

	    public Card(int rank, int suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public int getRank() {
	        return rank;
	    }

	    public void setRank(int rank) {
	        this.rank = rank;
	    }

	    public int getSuit() {
	        return suit;
	    }

	    public void setSuit(int suit) {
	        this.suit = suit;
	    }

		@Override
		public String toString() {
			return "Card [rank=" + rank + ", suit=" + suit + "]";
		}


	    

}
