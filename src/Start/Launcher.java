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
		
		ks.add(new String("hi"));
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");
		System.out.println(arr.contains("hi"));
		System.out.println(ks.contains("hi"));
		System.out.println("");
		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
