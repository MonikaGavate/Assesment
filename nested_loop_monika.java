/*
*   *
** **
* * * 
*   *
*   *
*/
public class nested_loop_monika {
   
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==2)
				{
					if(j==3)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
					if(i==3)
					{
						if(j==2||j==4)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("*");
						}
				   }
					if(i==1||i==4||i==5)
					{
						if(j==1||j==5)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
			}
			System.out.print("\n");
		}
	}
}
