
public class Quiz10 extends SumDiagonal implements IntBilgi {

	@Override
	/***
	 * Checks if the given integer is prime or not
	 */
	public boolean isPrime(int n) {
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
		for(int i = 3; i * i <=n; i +=2)
			if(n % i == 0)
				return false;
		return true;
	}

	@Override
	/***
	 * table's row and column numbers are equal
	 * this methods adds all prime numbers in the diagonal of the table and returns the sum
	 */
	public int sumOfDiagonal(int[][] table) {
		int sum = 0;
		int i = 0;
		int j = 0;
		while(i < table.length){
			if(isPrime(table[i][j])){
				sum = sum + table[i][j];
			}
			j++;
			i++;
		}
		return sum;
	}
	

}
