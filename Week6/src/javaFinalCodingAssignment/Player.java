package javaFinalCodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		if (hand.isEmpty() == false) {
			return hand.remove(0);
		}
		return null;
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	
	
}
