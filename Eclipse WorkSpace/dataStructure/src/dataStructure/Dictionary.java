package dataStructure;

import java.util.*;


public class Dictionary {

	public static void main(String[] args) {
		String[] Finnish = { "kissa", "koira", "hevonen", "auto", "vene" };
		String[] English = { "cat", "dog", "horse", "car", "boat" };
		String loop = "initialize";
		Scanner reader = new Scanner(System.in);

		HashMap<String, String> pairs = new HashMap<>();
		for(int i = 0; i < Finnish.length;i++) {
			pairs.put(English[i], Finnish[i]);
		}
		System.out.print("The Lexicon content:  { | ");
		
		for (String string : pairs.keySet()) {
			System.out.print( string +  " = " + pairs.get(string) + " | ");
		}
		System.out.print("}\n");
		
		while(!loop.equals("")) {
			System.out.print("Which word do you want translated? (leave blank to exit):  ");
			loop = reader.nextLine();
			if (pairs.get(loop) != null) {
				System.out.println(loop + "'s Finnish translation is: " + pairs.get(loop));
			}
			else if (!loop.equals("")) {
				System.out.println("The word you entered doesn't exist within the lexicon");
			}
		}
			System.out.print("Aight we good ");
	}
		
}
