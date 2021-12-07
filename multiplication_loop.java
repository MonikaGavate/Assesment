/*WAP to accept a number from user and display the multiplication 
table 5*1=5   */

import java.util.*;
class multiplication_loop
{
	public static void main(String args[])
	{
		int i,num,mult;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the no");
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			mult=num*i;
		
			System.out.println(num+"*"+i+"="+mult);
		}
	}
}