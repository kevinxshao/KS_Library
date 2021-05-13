package Start;
import data_structures.KS_ArrayList;
import java.util.*;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList<String> ks = new KS_ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();
		ks.add("hello");
		ks.add(new String("bye"));
		ks.add("sigh");
		ks.add("duh");
		
		arr.add("hello");
		arr.add(new String("bye"));
		arr.add("sigh");
		arr.add("duh");
		
		System.out.println(arr.indexOf("bye"));
		System.out.println(ks.indexOf("bye"));
		System.out.println("");
		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
