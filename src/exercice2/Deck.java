package exercice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		String[] types = { "Heart", "Clover", "Spade", "Diamond" };
		Map<String, Integer> titleValueMap = new HashMap<String, Integer>() {
			{
				put("2", 2);
				put("3", 3);
				put("4", 4);
				put("5", 5);
				put("6", 6);
				put("7", 7);
				put("8", 8);
				put("9", 9);
				put("10", 10);
				put("Jack", 10);
				put("Queen", 10);
				put("King", 10);
				put("Ace", 11);
			}
		};
		for (int i = 0; i < types.length; i++) {
			int _i = i;
			titleValueMap.forEach((key, value) -> {
				Card mycard = new Card(value, types[_i], key);
				this.cards.add(mycard);
			});
		}
	}

	public Deck(List<Card> cards) {
		this.cards = cards;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck mydeck = new Deck();
		System.out.println(mydeck.cards.toString());

	}

}
