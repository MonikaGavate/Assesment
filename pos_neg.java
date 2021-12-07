//WAP to accept a no from user and check it is positive or negative
import java.util.*;
class pos_neg
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("The no is neither positive nor negative");
		}
		else if(num>0)
		{
			System.out.println("The no is positive");
		}
		else
		{
			System.out.println("the no is negative");
		}
	 }
}
