import java.util.*;
public class operation
{
	void Asia(String s)
	{
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			c[i]=(char)(c[i]+2);
		}
	     String temp=new String(c);
		 System.out.println(temp);
	}
	void UnitedStates(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.print((int)(s.charAt(i)));
			if(i<s.length()-1)
			{
			System.out.print(".");
			}
		}
		System.out.println();
	}
	void Dubai(String s)
	{
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		System.out.println(sb.reverse());
	}
}
class secret extends operation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> l=new ArrayList<String>();
		int test_cases=sc.nextInt();
		sc.nextLine();
		int[] m=new int[test_cases];
		for(int i=0;i<test_cases;i++)
		{
			String s=sc.nextLine();
			l.add(s);
		}

		for(int j=0;j<test_cases;j++)
		{
			m[j]=sc.nextInt();
		}
		secret op=new secret();
		for(int k=0;k<test_cases;k++)
		{
			switch(m[k])
			{
				case (0):
				op.Asia(l.get(k));
				break;
				case (1):
				op.UnitedStates(l.get(k));
				break;
				case (2):
				op.Dubai(l.get(k));
				break;
			}
		}
		
		
	}
	
}