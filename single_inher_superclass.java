import java.util.Scanner;

public class single_inher_superclass {
	public static void greater(){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 no");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
			else if(b>c && b>a)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
	}
		
}
