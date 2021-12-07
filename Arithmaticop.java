//WAP to accept two numbers from user and do the arithmetic operation
import java.util.*;
class Arithmaticop
{
        public static void main(String args[])
        {
	     int num1,num2,add,sub,mul,div;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter two no");
	     num1=sc.nextInt();
	     num2=sc.nextInt();
	     add=num1+num2;
	     System.out.println("addition of two no="+add);
		 sub=num1-num2;
	     System.out.println("substraction of two no="+sub);
		 mul=num1*num2;
	     System.out.println("multiplication of two no="+mul);
		 div=num1/num2;
	     System.out.println("division of two no="+div);
		}
}