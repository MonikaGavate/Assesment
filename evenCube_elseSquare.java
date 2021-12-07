/*WAP to accept a no from user if no is even than display the cube
or else display the squar*/
import java.util.*;
class evenCube_elseSquare
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("cube of the no "+num*num*num);
		}
		else
		{
			System.out.println("square of the no "+num*num);
		}
	}
}
