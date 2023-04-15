package war;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//import java.util.Random;

@SuppressWarnings("serial")
public class Deck extends AbstractCardList{
	private List<String> cardNames = List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	
	private List<String> cardSuits = List.of("Queens", "Diamonds", "Spades", "Clubs");
	
	private int startRank = 2; 
	
	public Deck() {
		
		
		for (int rank = startRank; rank < cardNames.size() + startRank; rank++) {
			String cardName = cardNames.get(rank - startRank);
			generateCardsForPerson(rank, cardName);
		}
	}
	
	
	
	private void generateCardsForPerson(int rank, String cardName) {
		for(String suit : cardSuits) {
			add(new Card(cardName, suit, rank));
		}
		
	}
	
	
	public void shuffle() {
//		Random random = new Random(); 
//		
//		for(int cardPos = 0; cardPos< size(); cardPos++) {
//			int swapPos = random.nextInt(size());
//			
//			Card card = get(cardPos);
//			set(cardPos, get(swapPos));
//			set(swapPos, card); 
//		}
		Collections.shuffle(this); 
	}
//List<Card> card = new ArrayList<Card>(); 
//	
//	// Constructor
//	Deck(){
//		String[] suits = {"Queens", "Diamonds", "Spades", "Clubs"};
//		String[] numNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
//		
//		for (String suit : suits) {
//			int count = 2; 
//			for (String num : numNames) {
//				card.add(new Card(num, suit, count)); 
//				count++; 
//			}
//		}
//	}
//	
//	public List<Card> getCard(){
//		return card; 
//	}
//	public void setCard(List<Card> card) {
//		this.card = card;
//	}
//	public void describe() {
//		for(Card card : this.card) {
//			card.Describe();
//		}
//	}
//	public void shuffle() {
//		Collections.shuffle(this.card);
//	}
//	public Card draw() {
//		Card card = this.card.remove(0);
//		return card;
//	}
	

	
}
