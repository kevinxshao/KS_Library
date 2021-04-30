package data_structures;

public class KS_ArrayList<T> {
	private Object arr[];
	private int numOfItems;
	private int capacity;

	public KS_ArrayList() {
		capacity =10;
		numOfItems = 0;
		arr = new Object[capacity];
	}
	public KS_ArrayList(int c) {
		capacity = c;
		numOfItems = 0;
		arr = new Object[capacity];
	}
	public void add(T element) {
		if(numOfItems == capacity) {
			Object copyarr[] = new Object[numOfItems];
			for(int i = 0; i < numOfItems; i++) {
				copyarr[i] = arr[i];
			}
			capacity = capacity*3/2+1;
			arr = new Object[capacity];
			for(int i =0; i < numOfItems; i++) {
				arr[i] = copyarr[i];
			}
		}
		arr[numOfItems] = element;
		numOfItems++;
	}
	public Object get(int index) {
		if(index > numOfItems-1) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		return (T) arr[index];
	}
	public int size() {
		return numOfItems;
	}
	
	public boolean isEmpty() {
		if(numOfItems ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int currentCapacity() {
		return capacity;
	}
	

}
