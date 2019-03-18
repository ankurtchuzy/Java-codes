import java.util.*;

class repetitive
   {
    public static void main (String args[])
	
	{
	 boolean a;
	 int len;
	 int arr[]={1,2,3,4,1};
	 len=arr.length;
	 
	 for(int i=0;i<len;i++)
	  {
	    a=true;
		for(int j=0; j<len;j++)
		    {
			if(arr[i]==arr[j]&&(i!=j))
			   a=false;
			}   
	    if(a==true)
        System.out.println(arr[i]);	  
      }	
	}
	
	}