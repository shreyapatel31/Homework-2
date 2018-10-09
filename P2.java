=
public class P2 {
	
	public static void mergeSort (int [] a, int arraySize) {
		arraySize = a.length;
		
		int high = 0;
		int low = 0;
		int temp;
		
		int M = high - low;
		if (M <= 1) {
			return; }
		int middle = (M + 1)/2;
		
		for (int i = 0; i < middle; i++) {
			if(a[i] > a[i+1]) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
			else {
				a[i] = a[i];
				a[i+1] = a[i+1];
			}	
	} // sorted the first half of the array
		
		for (int j = middle + 1; j < high; j++) {
			if (a[j] > a[j+1]) {
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			else {
				a[j] = a[j];
				a[j+1] = a[j+1];
			}
		} // sorted the second half of the array
		
	int [] temporary = new int [M];	
	int b = low;
	int c = middle;
	
	for (int k = 0; k < M; k++) {
		if (b == middle) {
			temporary[k] = a[c++];
		}
		else if (c == high) {
			temporary[k] = a[b++];
		}
		else if (a[c] < a[b]) {
			temporary[k] = a[c++];
		}
		else {
			temporary [k] = a[b++];
		}
	} // combined the two sorted halves
}
	
	public static void main (String[] args) {
		int [] a = new int [] {3,10, 2, 15, 5, 7};
		mergeSort (a, 6);
	}

	
}
