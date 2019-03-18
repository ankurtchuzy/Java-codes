import java.util.*;

class comparing
   {
	   public static void main (String args[])
	    {
			int a,b,c;
			
			a=Integer.parseInt(args[0]); // given argument during run time is a string that is converted into an integet for operation
			b=Integer.parseInt(args[1]); 
			c=Integer.parseInt(args[2]);
			  if (a>b)
			   {
				   if(a>c)
					   System.out.println(a+" is the greatest among "+b+" and "+c);
				   else
					   System.out.println(c+" is the greatest among "+a+" and "+b);
			   }
			  else if (b>c)
				       System.out.println(b+" is the greatest among "+a+" and "+c);
				   else
					   System.out.println(c+" is the greatest among "+a+" and "+b);
				   
		}
   }
    // another logic
    //if (a>b && a>c)
	//   s.o.p(a);
    //else if (b>a && b>c)
	//   s.o.p(b);
    //else
    //   s.o.p(c);    
   