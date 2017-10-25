
public class Card
{
	private int value;
	private String suit;
	
	//constructor
	public Card(int val, String input_suit)
	{
		//store value and suit
		setValue(checkValid(val));
		setSuit(input_suit);
	}
	
	//print function
	public String print()
	{
		String retVal = "";
		
		//if it's not a face card
		if(getValue() < 11)
		{
			retVal = retVal + Integer.toString(getValue());
		}
		else if(getValue() == 11)
		{
			retVal = retVal + "Jack";
		}
		else if(getValue() == 12)
		{
			retVal = retVal + "Queen";
		}
		else if(getValue() == 13)
		{
			retVal = retVal + "King";
		}
		else if(getValue() == 14)
		{
			retVal = retVal + "Ace";
		}
		
		retVal = retVal + " of " + getSuit();
		
		return retVal;
	}
	
	//check for valid value
	private int checkValid(int val)
	{
		int retVal = val;
		
		if(val < 1 || val > 14)
		{
			retVal = 1;
		}
		
		return retVal;
	}
	
	//getters and setters
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public void setSuit(String suit)
	{
		this.suit = suit;
	}
}
