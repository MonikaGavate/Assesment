import java.util.Scanner;

public class single_inher_subclass extends single_inher_superclass {
	public static void profit_loss()
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
	public static void main(String[] args) {
        greater();
		profit_loss();
}
}
