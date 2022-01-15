import java.util.*;
public class array_transpose_mattrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j,row,col;
     Scanner sc=new Scanner(System.in);
	System.out.println("enter how many rows");
	row=sc.nextInt();
	System.out.println("enter how many cols");
	col=sc.nextInt();
	System.out.println("enter "+row*col+" no=");
	int[][]num=new int[row][col];
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
	       num[i][j]=sc.nextInt();
	    }
	}
		System.out.println("Matrix is=");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(num[i][j]+"\t");
		    }
			System.out.print("\n");
		}
		System.out.println("Transpose matrix=");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(num[j][i]+"\t");
			}
			System.out.print("\n");
		}
	}
}


