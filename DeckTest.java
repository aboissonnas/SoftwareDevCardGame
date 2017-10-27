import static org.junit.Assert.*;
import java.util.Vector;

import org.junit.Test;

public class DeckTest
{
	@Test
	public void testConstructor()
	{
		try
		{
			//confirm deck creation
			Deck d1 = new Deck();
			assertNotNull(d1);
			
			//confirm deck size
			Vector<Card> d1Deck = d1.getDeck();
			assertNotNull(d1Deck);
			assertEquals(52, d1Deck.size());
		}
		catch(InvalidCardException ex)
		{
			fail();
		}
	}

	@Test
	public void testShuffle()
	{
		try
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
		catch(InvalidCardException ex)
		{
			fail();
		}
	}
	
	@Test (expected = DeckDealOverflowException.class)
	public void testDeal() throws DeckDealOverflowException
	{
		try
		{
			//create a new deck and deal some cards
			Deck d1 = new Deck();
			Vector<Card> d1Deck = d1.getDeck();
			Vector<Card> dealtCards = d1.deal(4);
			
			//confirm that cards have been dealt
			assertEquals(dealtCards.size(), 4);
			for(int i = 0; i < dealtCards.size(); i++)
			{
				assertTrue(d1Deck.contains(dealtCards.get(i)));
			}
			
			//deal more cards
			Vector<Card> dealtCards2 = d1.deal(4);
			
			//confirm that new cards have been dealt
			for(int i = 0; i < dealtCards.size(); i++)
			{
				assertFalse(dealtCards.contains(dealtCards2.get(i)));
			}
			
			//confirm dealing too many cards throws exception
			Vector<Card> dealtCards3 = d1.deal(800);
			Vector<Card> dealtCards4 = d1.deal(d1.remainingCards() + 1);

		}
		catch(InvalidCardException ex)
		{
			fail();
		}
	}
}
