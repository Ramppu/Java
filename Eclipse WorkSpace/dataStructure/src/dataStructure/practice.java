package dataStructure;

import java.util.*;

public class practice {

	public static void main(String[] args) {
		ArrayList<String> uusiTaulu = new ArrayList<String>();
		uusiTaulu.add("eka");
		uusiTaulu.add("toka");
		uusiTaulu.add("kolmas");

		for(int i = 0; i < uusiTaulu.size(); i++) {
			System.out.println(uusiTaulu.get(i));
		}
		System.out.print("\n");

		TreeSet<String> fruits = new TreeSet<String>();

		fruits.add("Eka");
		fruits.add("Toka");
		fruits.add("Kolmas");

		Iterator<String> itr = fruits.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.print("\n");

		HashMap<String, String> parit = new HashMap<>();
		parit.put("koira", "dog");
		parit.put("kissa","cat");

		for (String string : parit.keySet()) {
			System.out.println(string +  " --> " + parit.get(string));
		}

	}

}
