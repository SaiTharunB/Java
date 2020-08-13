import java.util.*;
public class SavingAmount
{
	static int saving;
	public void setter(int num)
	{
		saving = num;
	}
	public int getter()
	{
		return saving;
	}
	public void increment()
	{
		saving+=1000;
	}
	public void decrement()
	{
		saving-=100;
	}
	public void checksavings()
	{
		if(saving>=1000)
		{
			System.out.println("Congratulations!");
		}
		else if(saving>=0 &&saving<1000)
		{
			System.out.println("Insufficient saving!");
		}
		else
		{
			System.out.println("You are in debt");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		SavingAmount sa=new SavingAmount();
		System.out.println("Enter the amount : ");
		sa.setter(s.nextInt());
		sa.decrement();
		sa.getter();
		sa.increment();
		sa.getter();
		sa.checksavings();
		System.out.println("Your current savings are RS"+saving);
	}
}