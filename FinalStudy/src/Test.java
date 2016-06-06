
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
	}


}


