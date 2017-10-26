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
}
