package Final_Test_Paper_1;

/*⦁	Static variables are not thread safe. Still wap such that static variable is thread safe*/


public class Q9
{
	 private static int counter = 0;

	    public static synchronized void incrementCounter() {
	        counter++;
	    }

	    public static synchronized int getCounter() {
	        return counter;
	    }


	public static void main(String[] args) throws InterruptedException
	{
	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) 
	            {
	                incrementCounter();
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) 
	            {
	                incrementCounter();
	            }
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Counter: " + getCounter());
	    }
	}
