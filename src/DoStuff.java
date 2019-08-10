
public class DoStuff implements Runnable {
	private static int d2[][];
	private static final int I = Integer.MAX_VALUE;
	private static final int dim = 100;
	private int i, k;

	public DoStuff(int d2[][], int k, int i) {
		this.d2 = d2;
		this.k = k;
		this.i = i;
	}

	public void run() {

		for (int j = 0; j < dim; j++) {

			if (d2[i][k] == I || d2[k][j] == I) {
				continue;
			} else if (d2[i][j] > d2[i][k] + d2[k][j]) {
				d2[i][j] = d2[i][k] + d2[k][j];
			}
		}

	}

}
