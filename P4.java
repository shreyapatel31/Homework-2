
public class P4 {

	public static void problem4A(int [] a, int arraySize) {
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		
		arraySize = a.length;
		
		for (int i = 0; i < arraySize; i += 2) {
			if (a[i] <= a[i+1] && a[i] >= a[i+2]) {
				temp1 = a[i+1];
				a[i+1] = a[i+2];
				a[i+2] = temp1;
			}
			else if (a[i] <= a[i+1] && a[i] <= a[i+2]) {
				temp2 = a[i];
				a[i] = a[i+1];
				a[i+1] = temp2;
			}
			else if(a[i] >= a[i+1] && a[i] >= a[i+2] && a[i+1] >= a[i+2]) {
				temp3 = a[i+1];
				a[i+1] = a[i+2];
				a[i+2] = temp3;
			}
			else {
				a[i] = a[i];
				a[i+1] = a[i+1];
				a[i+2] = a[i+2];
			}
		}
	}
	
	public static void main (String [] args) {
		int [] a = new int [] {8, 9, 0, 3, 1};
		problem4A(a, 5);
	}
}
