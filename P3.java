
public class P3 {
	
	private Node head;
	public int pointer;
	private int size;
	
	private class Node {
		int item;
		Node next;
		public Node (int item) {
			this.item = item;
		}
	}
	
	public int size () {return size;}

	public void linkedList() {
		head = null;
	}
	
	public void add(int a) {
		Node pointer = head;
		head = new Node (a);
		head.item = a;
		head.next = pointer;
		size++;
	}
	
	public void printList() {
		Node n = head;
		
		for (int i = 0; i < size; i++) {
			System.out.println(n.item + "," + "");
			n = n.next;
		}
		System.out.println("\n");
		
	}
	
	public void swap(int one, int two) {
		Node temp1 = head;
		for (int i = 0; i < one; i++) {
			temp1 = temp1.next;
		}
		Node temp2 = head;
		for (int j = 0; j < two; j++) {
			temp2 = temp2.next;
		}
		System.out.println("Swapping:" + temp1.item + "and" + temp2.item);
		
		int swap = temp1.item;
		temp1.item = temp2.item;
		temp2.item = swap;
	}
	
	public void shuffleList() {
		int x = 0;
		int y = 0;
		for (int i = 0; i < (int) (Math.random()*2*size) + 1; i++) {
			x = (int) (Math.random()*size);
			y = (int) (Math.random()*size);
			if (x != y) {
				swap (x, y);
			}
		}
	}
	 
	public int partition (int start, int end) {
		
		Node first = head;
		
		for (int i = 0; i < start; i++) {
			first = first.next;
		}
		Node pivot = first;
		Node temp = first.next;
		int storeIndex = start + 1;
		
		for (int i = storeIndex; i < end; i++) {
			System.out.println("Comparing:" + temp.item + "and" + pivot.item);
			if (temp.item < pivot.item) {
				if (i != storeIndex) {
					swap(i, storeIndex);
				}
				storeIndex++;
				
				pivot = temp.next;
				temp.next = pivot;
			}
			temp = temp.next;
		}
		printList();
		int partition = storeIndex - 1;
		return partition;
	}
	
	public void sorting(int start, int end) {
		if (start < end) {
			int partition = partition (start, end);
			sorting(start, partition);
			sorting(partition + 1, end);
		}
	}
	public void median() {
		Node x = head;
		Node y = head;
		Node z = head;
		for (int i = 0; i < size/2; i++) {
			y = y.next;
		}
		for (int i = 0; i < size - 1; i++) {
			z = z.next;
		}
		
		if (x.item > y.item) {
			if(y.item > z.item) {
				System.out.println("The median is:" + y.item);
				swap(0, size/2);
			}
			else if (y.item < z.item && x.item > z.item) {
				System.out.println("The median is:" + z.item);
				swap(0, size - 1);
			}
			else {
				System.out.println("The median is:" + x.item);
			}
			
		}
		else {
			if(x.item > z.item) {
				System.out.println("The median is:" + x.item);
			}
			else if (y.item > z.item && z.item > x.item) {
				System.out.println("The median is:" + z.item);
				swap(0, size - 1);
			}
			else {
				System.out.println("The median is:" + y.item);
				swap(0, size/2);
			}
		}
	}
	
	public void quickSort() {
		shuffleList ();
		int start = 0;
		int end = size;
		median();
		sorting(start, end);
	}
	
	public static void main (String [] args) {
		P3 list = new P3 ();
		list.add(3);
		list.add(10);
		list.add(4);
		list.add(8);
		list.add(2);
		list.add(7);
		list.printList();
		list.quickSort();
	}

}
	
	


