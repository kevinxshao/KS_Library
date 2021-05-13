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
	public void add(int index, T element) {
		if(index > numOfItems || index < 0) {
			throw new java.lang.ArrayIndexOutOfBoundsException();
		}
		if(numOfItems == capacity) {
			Object copyarr[] = new Object[numOfItems];
			for(int i = 0; i < numOfItems; i++) {
				copyarr[i] = arr[i];
			}
			capacity = capacity*3/2+1;
			numOfItems++;
			arr = new Object[capacity];
			int copyarrindex = 0;
			for(int i =0; i < numOfItems; i++) {
				if(i == index) {
					arr[i] = element;
				}
				else {
					arr[i] = copyarr[copyarrindex];
					copyarrindex++;
				}
			}
			numOfItems++;
		}
		else {
			Object copyarr[] = new Object[numOfItems];
			for(int i = 0; i < numOfItems; i++) {
				copyarr[i] = arr[i];
			}
			numOfItems++;
			arr = new Object[capacity];
			int copyarrindex = 0;
			for(int i =0; i < numOfItems; i++) {
				if(i == index) {
					arr[i] = element;
				}
				else {
					arr[i] = copyarr[copyarrindex];
					copyarrindex++;
				}
			}
		}
		
	}
	public void remove(Object element) {
		Object copyarr[] = new Object[capacity];
		int copyIndex = 0;
		boolean found = false;
		for(int i = 0; i < numOfItems; i++) {
			if(element instanceof String) {
				if(arr[i].equals(element) && found == false) {
					found = true;
					continue;
				}
				else {
					copyarr[copyIndex] = arr[i];
					copyIndex++;
					
				}
			}
			else {
				if(arr[i] == element && found == false) {
					found = true;
					continue;
				}
				else {
					copyarr[copyIndex] = arr[i];
					copyIndex++;
					
				}
			}
		
		}
		if(found == true) {
			numOfItems--;
		}
		arr =  new Object[capacity];
		for(int i = 0; i < numOfItems; i++) {
			arr[i] =  copyarr[i];
		}

	}
	public void remove(int index) {
		if(index >= numOfItems || index < 0) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		Object copyarr[] = new Object[capacity];
		int copyIndex = 0;
		for(int i = 0; i < numOfItems; i++) {
			if(i == index) {
				continue;
			}
			copyarr[copyIndex] = arr[i];
			copyIndex++;
		}
		arr =  new Object[capacity];
		for(int i = 0; i < numOfItems; i++) {
			arr[i] =  copyarr[i];
		}
		numOfItems--;
		
	}
	public Object get(int index) {
		if(index > numOfItems-1 || index < 0) {
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
