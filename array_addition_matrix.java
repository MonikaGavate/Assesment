import java.util.Scanner;

public class array_addition_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i,j,row,col;
	          Scanner sc=new Scanner(System.in);
	          System.out.println("Enter how many rows");
	          row=sc.nextInt();
	          System.out.println("Enter how many cols");
	          col=sc.nextInt();
	          System.out.println("Enter "+row*col+" No:");
	          int[][]a=new int[row][col];
	          for(i=0;i<row;i++)
	          {
	        	  for(j=0;j<col;j++)
	        	  {
	        		  a[i][j]=sc.nextInt();
	        	  }
	          }
	          System.out.println("1st matrix Are:");
	          for(i=0;i<row;i++)
	          {
	        	  for(j=0;j<col;j++)
	        	  {
	        		  System.out.print(a[i][j]+"\t");
	        	  }
	        	  System.out.print("\n");
	          }
	          System.out.println("Enter "+row*col+" No:");
	          int[][]b=new int[row][col];
	          for(i=0;i<row;i++)
	          {
	        	  for(j=0;j<col;j++)
	        	  {
	        		  b[i][j]=sc.nextInt();
	        	  }
	          }
	          System.out.println("2nd matrix Are:");
	          for(i=0;i<row;i++)
	          {
	        	  for(j=0;j<col;j++)
	        	  {
	        		  System.out.print(b[i][j]+"\t");
	        	  }
	        	  System.out.print("\n");
	          }
	         System.out.println("Addition=");
	         int [][]sum=new int[row][col];
	          for(i=0;i<row;i++)
	          {
	        	  for(j=0;j<col;j++)
	        	  {
	        		  sum[i][j]=a[i][j]+b[i][j];
	        		  System.out.print(sum[i][j]+"\t");
	        	  }
	        	  System.out.print("\n");
	          }
	        
	}

}
