
 public class sudoku {
	
	public static int[][] sudokuboard = {
			{5,3,0,0,7,0,0,0,0},
			{6,0,0,1,9,5,0,0,0},
			{0,9,8,0,0,0,0,6,0},
			{8,0,0,0,6,0,0,0,3},
			{4,0,0,8,0,3,0,0,1},
			{7,0,0,0,2,0,0,0,6},
			{0,6,0,0,0,0,2,8,0},
			{0,0,0,4,1,9,0,0,5},
			{0,0,0,0,8,0,0,7,9},
	};
	
	public static final int open = 0; 
	public static final int length = 9;

	private static boolean isinRow(int row, int number) {
		for (int i = 0; i < length; i++)
			if (sudokuboard[row][i] == number)
				return true;
		
		return false;
	}
	
	private static boolean isinCol(int col, int number) {
		for (int i = 0; i < length; i++)
			if (sudokuboard[i][col] == number)
				return true;
		
		return false;
	}
	
	
	private static boolean isinBox(int row, int col, int number) {
		int r = row - row % 3;
		int c = col - col % 3;
		
		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (sudokuboard[i][j] == number)
					return true;
		
		return false;
	}
	
	
	private static boolean isOk(int row, int col, int number) {
		return !isinRow(row, number)  &&  !isinCol(col, number)  &&  !isinBox(row, col, number);
	}
	

       public static boolean solve() {
        for (int row = 0; row < length; row++) {
         for (int col = 0; col < length; col++) {
          if (sudokuboard[row][col] == open) {
            for (int number = 1; number <= length; number++) {
              if (isOk(row, col, number)) {
                sudokuboard[row][col] = number;
                if (solve()) { 
                  return true;
                } else { 
                  sudokuboard[row][col] = 0;
                }
             }
            }
            return false; 
           }
          }
         }

         return true;
	}

	
	public static void main(String[] args) {
		if (solve() == true) {
			for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(" " + sudokuboard[i][j]);
			}
		
			System.out.println();
		}
		
		System.out.println();
		} 
		else {
			System.out.println("Unsolvable");
		}
	}

}