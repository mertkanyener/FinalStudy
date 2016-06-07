import java.util.Random;

public class ThreadPools implements Runnable {
	
	private int number;
	private Random ran;
	
	public ThreadPools(){
		ran = new Random();
		number = ran.nextInt(2000);
	}

	@Override
	public void run() {
		try{
			System.out.println("My Id: " + Thread.currentThread().getId() + "and I will wait about " + number);
			Thread.currentThread().sleep(number);
		}catch(InterruptedException e){
			System.out.println("Something went wrong.");
		}
		
	}
	

}
