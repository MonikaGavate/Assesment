/* WAP to accept choice from user and accordingly display the output
1:Even Odd
2:Check the voting eligibility
3:profit Loss
4:Arithmetic Operation
5:Ternary Operator
*/
import java.util.*;
class switch_op
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1:even or odd\n2:voting eligibility
		\n3:profit and loss\n4:Arithmatic operation\n5:Teranary operator");
		   ch=sc.nextInt();
	       //num=sc.nextInt();
		   //age=sc.nextInt();
		   switch(ch)
		   {
			   case 1:
			    int num;
			    System.out.println("enter the no");
			    num=sc.nextInt();
			   if(num%2==0)
			   {
				   System.out.println("no is even");
			   }
			   else if(num==0)
			   {
				   System.out.println("no is neither even nor odd");
			   }
			   else
			   {
				   System.out.println("no is odd");
			   }
			   break;
			   case 2:
			   int age;
			   System.out.println("enter the age");
			   age=sc.nextInt();
			   if(age>18)
			   {
				   System.out.println("person is eligible for voting");
			   }
			   else
			   {
				   System.out.println("person is not eligible for voting");
			   }
              break;			   
			  case 3:
			  int sp,cp,res;
			  System.out.println("enter sp");
			  sp=sc.nextInt();
			  System.out.println("enter cp");
			  cp=sc.nextInt();
			  res=sp-cp;
			  if(res>0)
			  {
				  System.out.println("profit="+res);
			  }
			  else if(res==0)
			  {
				  System.out.println("neither profit nor loss");
			  }
			  else
			  {
				  System.out.println("loss="+(-res));
			  }
			  break;
			  case 4:
			  int num1,num2,add,sub,mul,div;
			  System.out.println("enter num1 and num2");
			  num1=sc.nextInt();
			  num2=sc.nextInt();
			  add=num1+num2;
			  System.out.println("addition="+add);
			  sub=num1-num2;
			  System.out.println("subtraction="+sub);
			  mul=num1*num2;
			  System.out.println("multiplication="+mul);
			  div=num1/num2;
			  System.out.println("division="+div);
			  break;
			  case 5:
			  int result,a,b;
			  System.out.println("enter two no");
			  a=sc.nextInt();
			  b=sc.nextInt();
			  result=(a>b)?a:b;
			  System.out.println("Result="+result);
			  break;
			  default:
			  System.out.println("please enter valid data");
			  break;
		   }
	}
	
}
