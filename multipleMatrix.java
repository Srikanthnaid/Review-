package Matrix;

public class multipleMatrix {
	public void multipleMAtrix() {
		int a[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 2, 5, 6 } };
		int b[][] = { { 4, 5, 6 }, { 6, 3, 4 }, { 1, 2, 3 } };
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] = a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		multipleMatrix matrix = new multipleMatrix();
		matrix.multipleMAtrix();

	}

}
