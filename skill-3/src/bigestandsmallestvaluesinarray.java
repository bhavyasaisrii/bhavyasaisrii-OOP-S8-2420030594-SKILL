
public class bigestandsmallestvaluesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] data = {34, 12, 67, 89, 2, 45};
		        int min = data[0];
		        int max = data[0];

		        for (int val : data) {
		            if (val < min) min = val;
		            if (val > max) max = val;
		        }

		        System.out.println("Smallest: " + min);
		        System.out.println("Biggest: " + max);
		    }
		}

	