//class to hold a value and suit to imitate a playing card
public class Card
{
	private int value;
	private String suit;
	
	//constructor
	public Card(int val, String input_suit)
	{
		//store value and suit
		setValue(checkValidValue(val));
		setSuit(checkValidSuit(input_suit));
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
	private int checkValidValue(int val)
	{
		int retVal = val;
		
		//if value is invalid
		if(val < 2 || val > 14)
		{
			retVal = 1;
		}
		
		return retVal;
	}
	
	//check for valid suit
	private String checkValidSuit(String val)
	{
		String retVal = val;
		
		//if value is invalid
		if(val != "Hearts" && val != "Clubs" && val != "Spades" && val != "Diamonds")
		{
			retVal = "Invalid";
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
