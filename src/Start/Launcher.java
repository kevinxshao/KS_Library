package Start;
import data_structures.KS_ArrayList;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList ks = new KS_ArrayList();
		ks.add(1);
		ks.add(2);
		ks.add(3);
		for(int i =0; i < ks.size(); i++) {
			System.out.println(ks.get(i));
		}
	}
}
