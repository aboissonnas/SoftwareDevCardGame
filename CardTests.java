import static org.junit.Assert.*;

import org.junit.Test;

public class CardTests
{

	@Test
	public void testConstructor()
	{
		//confirm card creation
		try
		{
			Card c1 = new Card(5, "Hearts");
			assertFalse(c1 == null);
			assertEquals(c1.getValue(), 5);
			assertEquals(c1.getSuit(), "Hearts");
			assertEquals(c1.print(), "5 of Hearts");
			
			Card c2 = new Card(11, "Spades");
			assertFalse(c2 == null);
			assertEquals(c2.getValue(), 11);
			assertEquals(c2.getSuit(), "Spades");
			assertEquals(c2.print(), "Jack of Spades");
		}
		catch(Exception ex)
		{
			fail();
		}
	}
}
