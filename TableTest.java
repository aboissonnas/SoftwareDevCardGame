import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest
{

	@Test
	public void testConstructor()
	{
		try
		{
			//confirm table creation
			Table t1 = new Table();
			assertNotNull(t1);
			
			//confirm deck and player creation
			assertEquals(0, t1.getNumPlayers());
			t1.deal(4);
			
			//confirm table creation
			Table t2 = new Table(3);
			assertNotNull(t2);
			
			//confirm deck and player creation
			assertEquals(3, t2.getNumPlayers());
			t2.deal(4);
		}
		catch(DeckDealOverflowException ex)
		{
			fail();
		}
	}

}