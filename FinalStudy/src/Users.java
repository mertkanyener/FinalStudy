import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Users extends Thread {
	
	private ATM atm;
	private int money;
	private ReentrantLock myLock;
	
	public Users(ATM atm, int money, ReentrantLock lock){
		this.atm = atm;
		this.money = money;
		myLock = lock;
	}
	
	public void run(){
		try{
			myLock.lock();
			Random r = new Random();
			sleep(r.nextInt(1000));
			atm.getMoney(money);
			myLock.unlock();
		}catch(InterruptedException e){}
	}

}
