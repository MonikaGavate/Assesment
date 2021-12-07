//WAP to accept age from user and check it is eligible for voting or not
import java.util.*;
class voting
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Age");
		age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Person is eligible for voting");
		}
		else
		{
			System.out.println("Person is not eligible for voting");
		}
	}
}
