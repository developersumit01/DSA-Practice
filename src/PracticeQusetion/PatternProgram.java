package PracticeQusetion;

public class PatternProgram {

	public static void main(String[] args) {
		PatternProgram pP = new PatternProgram();
		pP.ZPattern(7);
	}

	public void pyramidPattern(int row) {
		/*
		        *
		       ***
		      *****
		     *******
		 */
		for (int i = 1; i <= row; i++) {
//			This for loop is use to print the spaces before stars.
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
//			This for loop is use to print star.
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void leftAngleTriangle(int row) {
		/*
		        *
		        **
		        ***
		 */
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rightAngleTriangle(int row) {
		/*
			    *
			   **
			  ***
		 */
		for (int i = 1; i <= row; i++) {
//				This for loop is use to print the spaces before stars.
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void squarePattern(int row, int column) {
		/*
		     ****
		     ****
		     ****
		 */
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void reversePyramid(int row) {

		/*
		     *****
		      ***
		       *
		*/
		for (int i = row; i >= 1; i--) {
//	This for loop is use to print the spaces before stars.
			for (int space = i - 1; space < row; space++) {
				System.out.print(" ");
			}
//	This for loop is use to print left side star.
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
//	Here i don't need to print the top first star that's why here we start my for loop from 1.
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void hollowSquare(int row, int column) {
		/*
		 ****
		 * *
		 ****
		 */
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == row - 1 || j == column - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void pascalTriangle(int row) {
		/*
		 * 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1
		 * 
		 */
		for (int i = 0; i <= row; i++) {
//			This for loop is use to print the spaces before stars.
			for (int j = 0; j <= row - i; j++) {
				System.out.print(" ");
			}
//			This for loop is use to print number.
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + fact(i) / (fact(i - j) * fact(j)));
			}
			System.out.println();
		}

	}

	public int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public void diamondPattern(int row) {
		/*
				   *
				  ***
				 *****
				  ***
				   *
		*/
//		This loop is use to print the upper triangle.
		for (int i = 1; i <= row; i++) {
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		This loop is use to print lower triangle.
		for (int i = row - 1; i >= 1; i--) {
			for (int space = i; space < row; space++) {
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void palindromePattern(int row) {

		/*
		 * 
		 * 1 121 12321 1234321
		 * 
		 */
		for (int i = 1; i <= row; i++) {
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j % i == 0) {
					System.out.print(i);
				} else {
					System.out.print(j % i);
				}
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j % i);
			}
			System.out.println();
		}
	}

	public void hollowPyramidPattern(int row) {
		/*
		 *
		 * * *
		 *******
		 */

		for (int i = 1; i <= row; i++) {
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2 * i; j++) {
				if (j == 2 * i - 1 || j == 1 || i == row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void ZPattern(int row) {

		/*
		   			*****
					   *   
					  *    
					 *     
					*****
		 */

		for (int i = 1; i <= row; i++) {
			for (int space = row; space > i; space--) {
				if (i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= i; j++) {
				if (j == 2 * i - 1 || j == 1 || i == row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
