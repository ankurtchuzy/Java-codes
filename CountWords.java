import java.util.*;

class CountWords
 {
  
  public static void CharCount (String s)
   {
    int len,count = 0;
    char arr[];
    arr=s.toCharArray();
    len=arr.length;
    
    for(int i=0;i<len;i++)
      {
       if(arr[i] != ' ')
       	  count++;
      }
     System.out.println ("The number of alphabets in this sentence is "+count);
    } 

  public static void WordCount (String s)
   {
    int len,count = 0;
    char arr[];
    arr=s.toCharArray();
    len=arr.length;

    for(int i=0;i<len;i++)
       {
        if(arr[i] == ' ')
         count++;
       }
     count=count+1;  
     System.out.println ("The number of words in this sentence is "+count);
    }

  public static void main (String arg[])
   {
    Scanner obj=new Scanner(System.in);
    String s;
    s=obj.nextLine();
    CharCount (s);
    WordCount (s);
   }    
        
  }  
