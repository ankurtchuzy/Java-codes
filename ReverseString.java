import java.util.*;
class ReverseString
 
  {

   public static void reverse (String s)
    {
     int len;
     char arr[];
     arr=s.toCharArray();
     len=arr.length-1;
     
     System.out.println("");//to give a space between entered string and reversed string
     
     for(int i=len;i>=0;i--)
     {
     System.out.print (arr[i]);
     }
     
    }

   public static void main (String arg[])
    {
     
     Scanner obj=new Scanner(System.in);
     String s;
     s=obj.nextLine();     


     //String s="BIOINFORMATICS";
     reverse (s);
    }
   }    