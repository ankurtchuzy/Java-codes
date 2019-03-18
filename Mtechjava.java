import java.util.*;
class Multithread extends Thread
{
    
    public void run()// called by start method
    {
									
       
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
			
       
    }
        
}

class Mtechjava
{
    public static void main(String[] args) 
	{
               
       for (int i=0; i<10; i++)
        {
            Multithread object = new Multithread();
            object.start();// calls the run method always
			
							
			Multithread object2 = new Multithread();
			object2.start();
			
						
        }
      
    }
    
}
