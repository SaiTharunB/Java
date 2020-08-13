import java.util.*;
interface adds
{
	void X(String A, String B);
}
public class Ascii
{
	
	public static void main(String[] ar)
	{
		String A,B;
		int c;
	Scanner sc=new Scanner(System.in);
	A=sc.nextLine();
	B=sc.nextLine();
	c=sc.nextInt();
	adds X1=(String a,String b)->
	{
	int sum=Integer.parseInt(a)+Integer.parseInt(b);
			System.out.println(sum);	
	};
	adds X2=(String a,String b)->
	{
		System.out.println(a+b);
	};
	adds X3=(String a,String b)->
	{
		int sum=Integer.parseInt(a);
			for(int i=0;i<b.length();i++)
			{
				sum+=b.charAt(i);
			}
			System.out.println(sum);
	};
	switch(c)
		{
		case (1):
			X1.X(A,B);
			break;
		case (2):
			X2.X(A,B);
			break;
		case (3):
			X3.X(A,B);
			break;
		}
}
}
