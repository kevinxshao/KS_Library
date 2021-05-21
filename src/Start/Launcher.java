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
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");
		ks.add("hello");
		ks.add("balah");
		ks.add("shoo");

		Object[] s1=  arr.toArray();
		Object[] s2 = ks.toArray();
		s2[0] = "boo";
		for(int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		System.out.println(s1.length);
		System.out.println(s2.length);
		System.out.println(arr);
		System.out.println(ks);
	}
}
