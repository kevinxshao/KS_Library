package Start;
import data_structures.KS_ArrayList;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList<String> ks = new KS_ArrayList<>();
		ks.add(new String("hello"));
		ks.add("bye");
		ks.add("yo");
		ks.add("good");
		ks.add("hello");
		System.out.println(ks.size());
		ks.remove("hello");
		System.out.println(ks.size());
		for(int i = 0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
