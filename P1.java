
public class P1 {
	
	
	public static void Problem1Sort(int [] a, int arraySize) {
		int [] x = new int [arraySize]; // array for each element of the bigger array
		int max = 0; //the maximum number of digits
		int numbers = 0; //the digits in the element
		
		for (int i = 0; i < arraySize; i++) { 
			numbers = String.valueOf(a[i]).length(); // assigns number to the number of digits for each bigger array element
				if (numbers > max) {
					max = numbers;
				}		
		} // finds the maximum of digits in the entire array
		
		for (int power = 1; power < max; power++) {
			int p = (int) Math.pow(10, power );
			
			for(int j = 0; j < arraySize; j++) {
				x[j] = a[j] % p; // sort by the certain place
			}
			for (int k = 0; k < arraySize; k++) {
				int big = a[k];
				int small = x[k];
				int m = k - 1;
				
				while (m >= 0 && x[m] > small) {
					a [m+1] = a[m];
					x[m+1] = x[m];
					m--;
				}
				a[m+1] = big;
				x[m+1] = small;
			}
			
			System.out.println("[");
			for (int b = 0; b < arraySize; b++) {
				System.out.println("" + a[b]);
			}
			System.out.println("]");
		}
	}
	
	public static void main (String args[]) {
		int [] a = new int [] {300, 12, 160, 4000, 3, 5513, 860};
		Problem1Sort(a, 7);
	}
}
		

