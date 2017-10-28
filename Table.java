import java.util.Vector;

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
			deck.shuffle();
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
			deck.shuffle();
		}
		catch(InvalidCardException ex)
		{
			System.out.println("Could not create deck");
		}
	}
	
	//deal some cards to each player
	public void deal(int numPerPlayer) throws DeckDealOverflowException
	{
		//go through players
		for(int i = 0; i < getNumPlayers(); i++)
		{
			//deal cards to each player
			Vector<Card> hand = deck.deal(numPerPlayer);
			
			System.out.println("Cards dealt to Player " + (i + 1));
			
			//print each card dealt
			for(int j = 0; j < hand.size(); j++)
			{
				System.out.println(hand.get(j).print());
			}
		}
	}
	
	//add a new player
	public void addNewPlayer()
	{
		numPlayers++;
	}
	
	//add multiple new players
	public void addNewPlayers(int num)
	{
		numPlayers = numPlayers + num;
	}
	
	//getter for number of players
	public int getNumPlayers()
	{
		return numPlayers;
	}
}
