import java.util.Scanner;
public class array_max {
   public static void main(String[] args) {
	          int i,size,max;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("enter the size of array:");
		      size=sc.nextInt();
		      int[] num=new int[size];
		      System.out.println("enter the array element:");
		      for(i=0;i<size;i++)
		      {
		    	  num[i]=sc.nextInt();
		      }
		      max=num[0];
		      for(i=0;i<size;i++)
		      {
		    	 if(max<num[i])
		        	{
		    		max=num[i];
		    	    }
		      }
		      System.out.print("maximum="+max);
		      
		      }
	}


