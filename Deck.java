import java.util.Vector;
import java.util.Collections;
import java.util.ListIterator;

//class to hold 52 playing cards to imitate a deck
public class Deck
{
	private Vector<Card> deck;
	private int dealLocation;
	
	//constructor
	public Deck() throws InvalidCardException
	{
		//initialize deck
		deck = new Vector<Card>(52);
		dealLocation = 0;
		
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
	
	//deal the specified number of cards out of the deck
	public Vector<Card> deal(int numToDeal) throws DeckDealOverflowException
	{
		Vector<Card> dealtCards = null;
		
		if(dealLocation + numToDeal > remainingCards())
		{
			throw new DeckDealOverflowException("Tried to deal more cards than are in the deck");
		}
		else
		{
			//make iterator and return vector
			ListIterator<Card> iterator = deck.listIterator(dealLocation);
			dealtCards = new Vector<Card>(numToDeal);
			
			//while there are more cards in the deck and not enough cards have been dealt
			while(iterator.hasNext() && iterator.nextIndex() < numToDeal + dealLocation)
			{
				dealtCards.add(iterator.next());
			}
			
			//update dealLocation
			dealLocation = iterator.nextIndex();
		}
		
		return dealtCards;
	}

	//find how many cards remain to be dealt
	public int remainingCards()
	{
		return deck.size() - dealLocation;
	}
	
	//getter for the deck
	public Vector<Card> getDeck()
	{
		return deck;
	}
}
