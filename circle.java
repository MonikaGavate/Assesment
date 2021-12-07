//WAP to accept radius from user and find SC and CC
import java.util.*;
class circle
{
   public static void main(String args[])
   {
    double r,pi=3.14,AC,CC;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius of circle");
	r=sc.nextDouble();
	AC=pi*r*r;
	System.out.println("Area of circle="+AC);
	CC=2*pi*r;
	System.out.println("Circumferences of circle="+CC);
   }
}