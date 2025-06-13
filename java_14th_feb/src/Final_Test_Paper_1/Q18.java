package Final_Test_Paper_1;

/*⦁	Create a thread without using extends or implements keyword that 
 * print first 10 even number and then the main thread prints first 10 odd number.
 *  [First child should complete then main thread]*/

public class Q18 {

	public static void main(String[] args) 
	{
           Runnable evenRunnable = new Runnable() 
           {
            @Override
            public void run()
            {
                for (int i = 2; i <= 20; i += 2) 
                {
                    System.out.println("Child Thread: " + i);
                }
            }
        };
        
        Thread evenThread = new Thread(evenRunnable);
        evenThread.start();

        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Main Thread: " + i);
        }

	}

}
