/*WAP to accept SP and CP from user and cala profit and loss
display the output*/
import java.util.*;
class profit_loss
{
	public static void main(String args[])
	{
		int sp,cp,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sp");
		sp=sc.nextInt();
		System.out.println("enter cp");
		cp=sc.nextInt();
		res=sp-cp;
		if(res==0)
		{
			System.out.println("neither profit nor loss");
		}
		else if(res>0)
		{
			System.out.println("profit="+res);
		}
		else
		{
			System.out.println("loss="+(-res));
		}
	}
}

