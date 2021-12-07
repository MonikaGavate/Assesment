//WAP to acccept length and breadth from user and find AR & PR
import java.util.*;
class Rectangle
{
   public static void main(String args[])
   {
     double l,b,AR,PR;
	 Scanner sc=new Scanner(System.in);
     	 System.out.println("Enter length and breadth");
		 l=sc.nextDouble();
		 b=sc.nextDouble();
		 AR=l*b;
		 System.out.println("Area of Rectangle="+AR);
		 PR=(2*l)+(2*b);
		 System.out.println("perimeter of Rectangle="+PR);
   }
}