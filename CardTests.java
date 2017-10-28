import static org.junit.Assert.*;

import org.junit.Test;

public class CardTests
{

	@Test
	public void testConstructor()
	{
		try
		{
			//confirm card creation
			Card c1 = new Card(5, "Hearts");
			assertNotNull(c1);
			assertEquals(5, c1.getValue());
			assertEquals("Hearts", c1.getSuit());
			assertEquals("5 of Hearts", c1.print());
				
			Card c2 = new Card(11, "Spades");
			assertNotNull(c2);
			assertEquals(11, c2.getValue());
			assertEquals("Spades", c2.getSuit());
			assertEquals("Jack of Spades", c2.print());
		}
		catch(InvalidCardException ex)
		{
			fail();
		}
	}
	
	@Test (expected = InvalidCardException.class)
	public void testInvalidValue() throws InvalidCardException
	{
		//confirm invalid value throws exception
		Card c1 = new Card(20, "Clubs");
	}
	
	@Test (expected = InvalidCardException.class)
	public void testInvalidSuit() throws InvalidCardException
	{
		//confirm invalid suit throws exception
		Card c2 = new Card(10, "badCard");
	}
}
