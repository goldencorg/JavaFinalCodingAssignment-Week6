package javaFinalCodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i + 1) + ":");
			
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			
			System.out.println("Player 1 flips: ");
			p1Card.describe();
			System.out.println("Player 2 flips:");
			p2Card.describe();
			
			if (p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins a point!");
			} else if (p1Card.getValue() < p2Card.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins a point!");
			} else {
				System.out.println("Tie! No point awarded.");
			}
			
			System.out.println("Score => Player 1: " + player1.getScore() + " | Player 2: " + player2.getScore() + "\n");
		}
		
		System.out.println("Final Score: ");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\nPlayer 1 wins the game!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\nPlayer 2 wins the game!");
		} else {
			System.out.println("\nThe game is a tie!");
		}
	}

}
