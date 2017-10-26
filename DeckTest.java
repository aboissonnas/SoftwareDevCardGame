import static org.junit.Assert.*;
import java.util.Vector;

import org.junit.Test;

public class DeckTest
{
	@Test
	public void testConstructor()
	{
		//confirm deck creation
		Deck d1 = new Deck();
		assertNotNull(d1);
		
		//confirm deck size
		Vector<Card> d1Deck = d1.getDeck();
		assertNotNull(d1Deck);
		assertEquals(52, d1Deck.size());
	}

	@Test
	public void testShuffle()
	{
		//create a deck and shuffle it
		Deck d1 = new Deck();
		d1.shuffle();
		Vector<Card> d1Deck = d1.getDeck();
		
		//create an unshuffled deck
		Deck d2 = new Deck();
		Vector<Card> d2Deck = d2.getDeck();
		
		//confirm deck d1 has been shuffled
		assertEquals(d1Deck.size(), d2Deck.size());
		
		int numInSamePosition = 0;
		
		for(int i = 0; i < d1Deck.size(); i++)
		{
			if(d1Deck.get(i).getValue() == d2Deck.get(i).getValue() &&
			   d1Deck.get(i).getSuit().equals(d2Deck.get(i).getSuit()))
			{
				numInSamePosition++;
			}
		}
		
		assertTrue(numInSamePosition < 5);
	}
}
