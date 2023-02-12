package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	// Kinds of suits
	public final static int DIAMONDS = 1;
	public final static int CLUBS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;

	// Kinds of ranks
	public final static int ACE = 1;
	public final static int DEUCE = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		super();
	}

	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public void displayCards() {
		this.cards.forEach(p -> System.out.println(p.toString()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Deck mydeck = new Deck();
	        Card card1 = new Card(Deck.SEVEN, Deck.DIAMONDS);
	        Card card2 = new Card(Deck.THREE, Deck.CLUBS);
	        Card card3 = new Card(Deck.KING, Deck.SPADES);

	        mydeck.addCard(card1);
	        mydeck.addCard(card2);
	        mydeck.addCard(card3);

	        mydeck.displayCards();

	}

}
