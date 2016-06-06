
public class Quiz9 implements IntSantral {
	/***
	 * prints the table
	 */
	public void printTable(int[][] table){
		for(int i = 0; i < table.length; i++){
			for(int j= 0; j < table[i].length; j++){
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	/***
	 * converts the signs of the each element in the table and then returns the updated table
	 */
	public int[][] convertSigns(int[][] table) {
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				table[i][j] = - table[i][j];
			}
		}
		return table;
	}
}
