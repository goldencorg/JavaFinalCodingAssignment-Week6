package javaFinalCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				cards.add(new Card(i + 2, names[i] + " of " + suit));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if(cards.isEmpty() == false) {
			return cards.remove(0);
		}
		return null;
	}
	
}
