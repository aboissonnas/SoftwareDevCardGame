//class to imitate a tableful of people playing a card game
public class Table
{
	private int numPlayers;
	private Deck deck;
	
	//empty constructor
	public Table()
	{
		//initialize number of players
		numPlayers = 0;
		
		try
		{
			//initialize deck
			deck = new Deck();
		}
		catch(InvalidCardException ex)
		{
			System.out.println("Could not create deck");
		}
	}
	
	//constructor given number of players
	public Table(int num)
	{
		//initialize number of players
		numPlayers = num;
		
		try
		{
			//initialize deck
			deck = new Deck();
		}
		catch(InvalidCardException ex)
		{
			System.out.println("Could not create deck");
		}
	}
	
	//deal some cards to each player
	public void deal(int numPerPlayer) throws DeckDealOverflowException
	{
		deck.deal(numPerPlayer * numPlayers);
	}
	
	//getter for number of players
	public int getNumPlayers()
	{
		return numPlayers;
	}
}
