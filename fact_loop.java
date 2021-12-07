/* WAP to accept a no from user and find out factorial */

import java.util.*;
class fact_loop
{
	public static void main(String args[])
	{
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the no");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
		fact*=i;
		}
		System.out.println("factorial="+fact);
	    
	}
	
}