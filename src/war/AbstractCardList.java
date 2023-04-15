package war;

import java.util.LinkedList;

@SuppressWarnings("serial")
public abstract class AbstractCardList extends LinkedList<Card> {
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(); 
		String lf = System.lineSeparator(); 
		String space = " "; 
		
		result.append(getClass().getSimpleName()).append(lf);
		
		for(Card card : this) {
			result.append(space).append(card).append(lf);
		}
		
		return result.toString(); 
	}
	
	public void Describe() {
		System.out.println(this); 
	}
}
