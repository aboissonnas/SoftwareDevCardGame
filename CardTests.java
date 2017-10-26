import static org.junit.Assert.*;

import org.junit.Test;

public class CardTests
{

	@Test
	public void testConstructor()
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
	
	@Test
	public void testValidValues()
	{
		//confirm invalid value becomes 1
		Card c1 = new Card(20, "Clubs");
		assertEquals(1, c1.getValue());
		
		//confirm invalid value becomes "Invalid"
		Card c2 = new Card(10, "badCard");
		assertEquals("Invalid", c2.getSuit());
	}
}
