/* *********
    *******
     *****
      ***
       *   
*/ 
public class nest_loop_pyramid_reverse {

	public static void main(String[] args) {
         int i,j;
      for(i=1;i<=5;i++)
      {
    	  for(j=1;j<i;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(j=9;j>=i*2-1;j--)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.print("\n");
      }
         
       	 
         
	}
}
