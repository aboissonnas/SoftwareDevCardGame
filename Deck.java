import java.util.Vector;
import java.util.Collections;

//class to hold 52 playing cards to imitate a deck
public class Deck
{
	private Vector<Card> deck;
	
	//constructor
	public Deck()
	{
		//initialize deck
		deck = new Vector<Card>(52);
		
		//temporary variables
		Card card;
		String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
		
		//make cards and add them to the deck
		for(int i = 0; i < 4; i++)
		{	
			for(int j = 2; j <= 14; j++)
			{
				card = new Card(j, suit[i]);
				deck.add(card);
			}
		}
	}
	
	//shuffle the deck randomly
	public void shuffle()
	{
		//shuffle deck
		Collections.shuffle(deck);
	}
	
	//getter for the deck
	public Vector<Card> getDeck()
	{
		return deck;
	}
}
