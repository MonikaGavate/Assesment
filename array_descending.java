	import java.util.Scanner;
public class array_descending {
	
    public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int i,j,size,temp;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("enter the size of array:");
		      size=sc.nextInt();
		      int[] num=new int[size];
		      System.out.println("enter the array element:");
		      for(i=0;i<size;i++)
		      {
		    	  num[i]=sc.nextInt();
		      }
		      for(i=0;i<size;i++)
		      {
		    	  for(j=i+1;j<size;j++)
		    	  {
		    	 if(num[i]<num[j])
		        	{
		    		temp=num[i];
		    		num[i]=num[j];
		    		num[j]=temp;
		    	    }
		         }
		      }
	     System.out.println("numbers in acsending order:");
	     for(i=0;i<size;i++)
	     {
	    	 System.out.print(num[i]+"\t");
	     }
	}
	}


