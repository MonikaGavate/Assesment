import java.util.Scanner;
public class array_min {
	public static void main(String[] args) {
		          int i,size,min;
			      Scanner sc=new Scanner(System.in);
			      System.out.println("enter the size of array:");
			      size=sc.nextInt();
			      int[] num=new int[size];
			      System.out.println("enter the array element:");
			      for(i=0;i<size;i++)
			      {
			    	  num[i]=sc.nextInt();
			      }
			      min=num[0];
			      for(i=0;i<size;i++)
			      {
			    	 if(min>num[i])
			        	{
			    		min=num[i];
			    	    }
			      }
			      System.out.print("minimum="+min);
			      
			      }
		}




