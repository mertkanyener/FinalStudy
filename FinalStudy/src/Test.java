import java.util.concurrent.locks.ReentrantLock;

public class Test {

	public static void main(String[] args) {
		// Test of quiz 9 
		Quiz9 q = new Quiz9();
		int[][] table = {{1 , 2 , -3},{-16, -8, 10}};
		q.printTable(table);
		q.convertSigns(table);
		System.out.println();
		q.printTable(table);
		// Test of quiz 10
		System.out.println();
		Quiz10 q2 = new Quiz10();
		int[][] table2 = {{3,6,8},{5,7,10},{12,18,11}};
		int result = q2.sumOfDiagonal(table2);
		System.out.println(result);
		// Test of quiz 12
		System.out.println();
		Quiz12One q3 = new Quiz12One();
		Quiz12Two q4 = new Quiz12Two();
		Thread t1 = new Thread(q3);
		t1.start();
		q4.start();
		
		System.out.println();
		//Test of ATM
		ATM atm = new ATM(1000);
		ReentrantLock myLock = new ReentrantLock();
		Users u1 = new Users(atm, 500, myLock);
		Users u2 = new Users(atm, 700, myLock);
		Users u3 = new Users(atm, 300, myLock);
		u1.start();
		u2.start();
		u3.start();
		
		System.out.println();
		// Test of ThreadPools
		PoolTest pt = new PoolTest();
		pt.start();
	}


}


