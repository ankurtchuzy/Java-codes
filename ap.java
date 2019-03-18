import java.util.*;

class ap
   {
    public static void main (String args[])
	
	{
	int a,d,n,sum=0;
	Scanner obj=new Scanner (System.in);
	
	System.out.println ("enter the first term of ap");
	a=obj.nextInt();
	
	
	System.out.println ("enter the common difference of ap");
	d=obj.nextInt();
	
	
	System.out.println ("enter number of terms of ap");
	n=obj.nextInt();
	
	System.out.println (" ");
	for (int i=0;i<n;i++)
	  {
	  sum=a+i*d;
	  System.out.print(sum+",");
      sum=0;	
	  }
    } 
   }