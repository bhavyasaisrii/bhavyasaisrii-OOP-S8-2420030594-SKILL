
public class trasposeofamatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[][] A = {
		            {1, 2},
		            {3, 4}
		        };
		        int[][] B = {
		            {2, 0},
		            {1, 2}
		        };
		        int[][] result = new int[2][2];

		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                result[i][j] = 0;
		                for (int k = 0; k < 2; k++) {
		                    result[i][j] += A[i][k] * B[k][j];
		                }
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}
