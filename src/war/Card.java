package war;

import java.util.List;

@SuppressWarnings("unused")
public class Card {
	// Data Members
		private String name;
		private String suit;
		private int value;
		
		//  constructor
		public Card(String name, String suit, int value) {
			this.name = name;
			this.suit = suit;
			this.value = value;
		}
		
		// Getters
		public String getName() {
			return name;
		}
		
		public String getSuit() {
			return suit;
		}
		
		public int getValue() {
			return value;
		}
		
		// Setters
		public void setName(String name) {
			this.name = name; 
		}
		
		public void setSuit(String suit) {
			this.suit = suit;
		}
		
		public void setValue(int value) {
			this.value = value; 
		}
		/* // To String
		public void Describe() {
			System.out.println(this.name + " of " + this.suit + " (" + this.value + ")"); 
		} */ 
		@Override
		public String toString() {
			return name + " of " + suit; 
		}

}
