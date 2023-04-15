package war;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	
	private List<String> friends = List.of("Rachel", "Monica", "Phoebe", "Ross", "Chandler", "Joey"); 
	// Determines random order
	private Random random = new Random(); 
	private Player player1;
	private Player player2; 
	private Deck deck; 
	
	public static void main(String[] args) {
		// Make: App, card, deck, player
		new App().run();
		
	}
	private void run() {
		selectPlayers();
		createAndShuffleDeck();
		dealCards();
		playGame();
		declareWinner();
	}
	private void declareWinner() {
		if(player1.getScore() > player2.getScore()) {
			printWinner(player1);
			printLoser(player2);
		}
		else if(player2.getScore() > player1.getScore()) {
			printWinner(player2);
			printLoser(player1); 
		}
		else {
			printTie(player1, player2); 
		}
	}
	private void printTie(Player player1, Player player2) {
		System.out.printf("%n%s and %s tied with a score of %d.%n", player1, player2, player1.getScore());
		
	}
	private void printLoser(Player loser) {
		System.out.printf("%s is the unfortunate loser with a score of %d.%n", loser, loser.getScore());
		
	}
	private void printWinner(Player winner) {
		System.out.printf("%n%s is the winner with a score of %d.%n", winner, winner.getScore());
		
	}
	private void playGame() {
		int numTurns = player1.getHand().size();
		
		for(int turn = 0; turn < numTurns; turn++) {
			playerFlipCards(); 
		}
	}
	private void playerFlipCards() {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		if(card1.getValue() > card2.getValue()) {
			player1.incrementScore(); 
		}
		else if(card2.getValue() > card1.getValue()) {
			player2.incrementScore(); 
		}
		System.out.printf("%s's card was %s against %s's card %s.%n", player1, card1, player2, card2);
	}
	private void dealCards() {
		int size = deck.size();
		
		for(int index = 0; index < size; index++) {
			if(index % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck); 
			}
		}
		
		//player1.describe(); 
		//player2.describe();
	}
	private void createAndShuffleDeck() {
		deck = new Deck(); 
		deck.shuffle(); 
		//deck.Describe(); 
		
	}
	private void selectPlayers() {
		List<String> names = new LinkedList<>(friends);
		player1 = selectPlayer(names);
		player2 = selectPlayer(names);
		
		System.out.printf("%s is playing %s.%n%n", player1, player2); 
	}
	private Player selectPlayer(List<String> names) {
		// sets position value to range of players
		int pos = random.nextInt(names.size()); 
		String name = names.remove(pos); 
		return new Player(name); 
		
	}

}
