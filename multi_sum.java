import java.util.*;

class multithread extends Thread
  {
	  int from;
	  int to;
	  long ini_time;
     
	 public multithread(int a, int b,long time) // constructor
	  {
	   from=a;
	   to=b;
	   ini_time=time;
	   }
     
	 public void run()// called by start()
	  {
	    int sum=0;
	    for(int i=from;i<=to;i++)
		    {
			 sum=sum+i;
			}
		System.out.println ("The sum from "+from+" to "+to+" is "+sum);
		long time1= System.currentTimeMillis()-ini_time;
		System.out.println ("The execution time for this thread is "+ time1);
	  }
  }  
  
 class multi_sum
  {
	  public static void main (String args[])
	  {
	   
	   long time= System.currentTimeMillis();
       multithread o1=new multithread(1,2000,time);
       o1.start();// calls the run() method
	   
	   multithread o2=new multithread(2001,4000,time);
       o2.start();
	   
	   multithread o3=new multithread(4001,6000,time);
       o3.start();
	   
	   multithread o4=new multithread(6001,8000,time);
       o4.start();
	   
	   multithread o5=new multithread(8001,10000,time);
       o5.start();
	  }
  }  
	   