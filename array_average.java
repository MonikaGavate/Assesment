import java.util.*;
public class array_average {
      public static void main(String[] args) {
		     int i,size;
      float sum=0,avg=0;
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
    	  sum=sum+num[i];
          avg=sum/size;
        }
      System.out.println("sum="+sum);
      System.out.println("Average="+avg);
      }
}
