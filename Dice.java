
public class Dice {
	
	
	private int mDiceCount;
	private int diceValue;

	
	
	public Dice(int DiceCount){
		
		mDiceCount = DiceCount;
		
		
	}

	public int RollDice()
	{
	
		int val = 0;
		for (int i =0;i<mDiceCount; i++)
					
		val=  val +(int)(Math.random()*6) + 1;
		
	{
		return val;
	}
	
	
	}
	
	public int Throw()
	{
		diceValue =(int)(Math.random()*6) + 1;;
		return diceValue;
	}
	
	
	public int Value()
	{
		
		return diceValue;
	}
	
	
	
	
}
