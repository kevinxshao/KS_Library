package data_structures;

public class KS_ArrayList {
	private Object arr[];
	private int numOfItems;
	private int capacity;

	public KS_ArrayList() {
		capacity =10;
		numOfItems = 0;
		arr = new Object[capacity];
	}
	public void add(Object element) {
		arr[numOfItems] = element;
		numOfItems++;
	}
	public Object get(int index) {
		if(index > numOfItems-1) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public int size() {
		return numOfItems;
	}

}
