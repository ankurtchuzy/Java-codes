import java.util.*;

class primenumber
 {
  public static void main (String args[])
   {
    int a,div;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a number to find if it is prime or not");
    a=obj.nextInt();
    div=a%2;
    if(div==0)
      System.out.println("number is composite");
    else
      System.out.println("number is prime");
    }
   }
    