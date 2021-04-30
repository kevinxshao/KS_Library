package Start;
import data_structures.KS_ArrayList;

public class Launcher {
	public static void main(String[] args) {
		KS_ArrayList<Integer> ks = new KS_ArrayList<>();
		System.out.println(ks.currentCapacity());
		for(int i =1; i <=16; i++) ks.add(i);
		ks.add(17);
		System.out.println(ks.currentCapacity());
		for(int i=0; i <ks.size();i++)System.out.println(ks.get(i));
		
	}
}
