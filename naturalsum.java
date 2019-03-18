import java.util.*;

class naturalsum
 {
  public static void main (String args[])

  {
   int i,n,sum=0;
   Scanner obj=new Scanner(System.in);
   System.out.println ("enter a number");
   n=obj.nextInt();
   for(i=1;i<=n;i++)
       {
        sum=sum+i;
       }
   System.out.println ( "The sum of natural numbers upto "+ n + " is "+ sum );
  }    
 } 