
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		System.out.println(" main thread starts....");
		for (int i = 1; i<=5; i++)
		{
			System.out.println("Main thread iteration " +i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread ends...");
	}

}
