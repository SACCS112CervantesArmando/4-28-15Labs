
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
		int val;
		val = +(int)(Math.random()*6) + 1;
		return val;
	}
	{
	
		int val = 0;
		for (int i =0;i<mDiceCount; i++)
					
		val=  val +(int)(Math.random()*6) + 1;
		
	{
		return val;
	}
	}
	
	
	
	
	public int Throw2()
	{
		diceValue =(int)(Math.random()*6) + 1;;
		return diceValue;
	}
	
	
	public int Value()
	{
		
		return diceValue;
	}
	
	
	public int Throw3(int Bounces)
	{
		int value = 0;
		int total = 0;
		int count = 1;
		
		
		for(int i =0;i<Bounces; i++)
		{
			value = +(int)(Math.random()*6) + 1;
			System.out.println("Bounce: " + count++ + " random number: " + value);
			total = total +value;
		}
				
		int average = 0;
		average = total/Bounces;
		System.out.print("Average: " + average);
		
		return average;
		
	}
	
	
}
