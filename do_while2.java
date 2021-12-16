/* starters,main course ,Desert*/

import java.util.*;
class do_while2
{
	public static void main(String args[])
	{
		char ans;
		int ch,ch1,ch2,ch3,fin_amt=0;
		String Item="";
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Welcome to food corner");
			System.out.println("1:starters");
			System.out.println("2:main course");
			System.out.println("3:Desert");
			System.out.println("enter your ch choice");
			ch=sc.nextInt();
			switch(ch)
			{
			
				case 1:
				do
				{
				   System.out.println("1:starters...:");
	    		   System.out.println("1:dahi\t\t\t50rs");
                   System.out.println("2:paneer\t\t100rs");
				   System.out.println("3:loni\t\t\t150rs");
                   System.out.println("4:milk\t\t\t50rs");
				   System.out.println("enter your ch1 choice");
				   ch1=sc.nextInt();
				   switch(ch1)
				   {
					  case 1:
					    fin_amt+=50;
						Item+="\n1:dahi\t\t\t\t50rs";
					   break;
					  case 2:
					    fin_amt+=100;
						Item+="\n2:paneer\t\t\t100rs";
					   break;
					  case 3:
					    fin_amt+=150;
						Item+="\n3:loni\t\t\t150rs";
					   break;
					  case 4:
					    fin_amt+=50;
						Item+="\n4:milk\t\t\t50rs";
					   break;
					  default:
					   System.out.println("Invalid your ch1 choice");
				   }
					
				System.out.println("Do you want to add some more starters y/n");
				ans=sc.next().charAt(0);
				}
				while(ans=='y'||ans=='Y');
				break;
				case 2:
				do
				{
				   System.out.println("2:main course...:");
                   System.out.println("1:cold coffee\t\t\t30rs");
                   System.out.println("2:hot coffee\t\t\t20rs");
                   System.out.println("3:chocklate coffee\t\t40rs");
                   System.out.println("4:plain coffee\t\t\t25rs");
				   System.out.println("enter your ch2 choice");
				   ch2=sc.nextInt();
				   switch(ch2)
				   {
					   case 1:
					     fin_amt+=30;
						 Item+="\n1:cold coffee\t\t\t30rs";
						 break;
					   case 2:
					     fin_amt+=20;
						 Item+="\n2:hot coffee\t\t\t20rs";
					     break;
					   case 3:
					     fin_amt+=40;
						 Item+="\n3:chocklate coffee\t\t40rs";
						 break;
					   case 4:
					     fin_amt+=25;
						 Item+="\n4:plain coffee\t\t\t25rs";
						 break;
					   default:
					   System.out.println("invalid ch2 choice");
				   }
				     System.out.println("do you want to add some more main course y/n");
				        ans=sc.next().charAt(0);
		        }
			            while(ans=='y'||ans=='Y');
				       break;
				case 3:
				do
				{
				   System.out.println("3:Desert...:");
				   System.out.println("1:apple juice\t\t\t50rs");
				   System.out.println("2:mango juice\t\t\t60rs");
				   System.out.println("3:orange juice\t\t\t70rs");
				   System.out.println("4:pinapple juice\t\t80rs");
				   System.out.println("Enter your ch3 choice");
				   ch3=sc.nextInt();
				   switch(ch3)
				   {
					   case 1:
					    fin_amt+=50;
						Item+="\n1:apple juice\t\t\t50rs";
						break;
					   case 2:
					    fin_amt+=60;
						Item+="\n2:mango juice\t\t\t60rs";
						break;
					   case 3:
					    fin_amt+=70;
						Item+="\n3:orange juice\t\t\t70rs";
						break;
					   case 4:
					    fin_amt+=80;
						Item+="\n4:pinapple juice\t\t80rs";
						break;
					 default:
					     System.out.println("Invalid ch3 choice");
				   }
				   System.out.println("Do you want to add some more Desert y/n");
						ans=sc.next().charAt(0);
				   }
				   while(ans=='y'||ans=='Y');
						break;
				   
				default:
				   System.out.println("Invalid ch choice");
			}
              System.out.println("Do you want to add some more items y/n");		
			   ans=sc.next().charAt(0);
			  
		}
		while(ans=='y'||ans=='Y');
			System.out.println("Thank You");
		System.out.println("Selected Item is="+Item);
		System.out.println("Your final amount is="+fin_amt);
	}
}