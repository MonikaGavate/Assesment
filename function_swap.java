import java.util.*;
public class function_swap {
	 public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int a,b;
          System.out.println("Enter 1st number");
          a=sc.nextInt();
          System.out.println("Enter 2nd number");
          b=sc.nextInt();
          swap(a,b);
          swap1(a,b);
          }
	 public static void swap(int n1,int n2)
	 {
		System.out.println("before swapping using 3rd var a="+n1+" b="+n2);
		 int temp=n1;
		 n1=n2;
		 n2=temp;
		 System.out.println("after swapping using 3rd var a="+n1+" b="+n2);
	 }
	 public static void swap1(int n1,int n2)
	 {
	   System.out.println("before swapping  a="+n1+" b="+n2);
		 n1=n1+n2;
		 n2=n1-n2;
		 n1=n1-n2;
	   System.out.println("after swapping  a="+n1+" b=" +n2);
	 }
}