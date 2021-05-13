package Start;
import data_structures.KS_ArrayList;
import java.util.*;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList<Integer> ks = new KS_ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		ks.add(1);
		ks.add(2);
		ks.add(3);
		ks.add(4);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		ks.get(1);

		System.out.println(ks.size());
		System.out.println(arr.size());
		System.out.println("");
		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
