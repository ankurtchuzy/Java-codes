import java.util.*;

class comparing
   {
	   public static void main (String args[])
	    {
			int a,b;
			
			a=Integer.parseInt(args[0]); // given argument during run time is a string that is converted into an integet for operation
			b=Integer.parseInt(args[1]); 
			
			if (a>b)
			    System.out.println(a+" is greater than "+b);
			else
				 System.out.println(b+" is greater than "+a);
			 
		}
   }