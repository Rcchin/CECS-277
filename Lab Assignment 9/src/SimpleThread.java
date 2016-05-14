/**
 * SimpleThread is a simple thread that runs your message may delay as well.
 * @author Raymond Chin 012754597
 *
 */
public class SimpleThread extends Thread {
	/**
	 * this is the message to display
	 */
	private String message;
	

	/**
	 * Constructor
	 * @param m message to display
	 */
	public SimpleThread(String m) {
		message = m;
		
	}
	/**
	 * runs the threads
	 */
	public void run() {
		for(int i = 0; i<=9;i++)
		{
			System.out.println(i + " " + message);
			try {
				this.sleep((int)Math.random()*7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (i == 9) {
				System.out.println("DONE! " + message);
				
			}
		}
		
	}

}