package Start;
import data_structures.KS_ArrayList;
import java.util.*;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList<String> ks = new KS_ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();
		arr.add(new String("hi"));
		arr.add("hello");
		arr.add("balah");
		arr.add("shoo");
		arr.trimToSize();
		ks.add(new String("hi"));
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");
		System.out.println(ks.currentCapacity());
		ks.trimToSize();
		ks.add(new String("hi"));
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");


		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(ks);
		System.out.println(ks.size());
		System.out.println(ks.currentCapacity());
	}
}
