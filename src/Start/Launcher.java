package Start;
import data_structures.KS_ArrayList;
import java.util.*;

public class Launcher {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		KS_ArrayList<Object> ks = new KS_ArrayList<>();
		Launcher l = new Launcher();
		ks.add(new Launcher());
		ks.add(new Launcher());
		ks.add(l);
		ks.add(new Launcher());
		ks.add(new Launcher());
		ks.add(new Launcher());
		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
		System.out.println();
		ks.remove(5);

		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
