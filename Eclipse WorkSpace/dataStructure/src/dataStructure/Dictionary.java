package dataStructure;

import java.util.*;


public class Dictionary {

	public static void main(String[] args) {
		String[] Finnish = { "kissa", "koira", "hevonen", "auto", "vene" };
		String[] English = { "cat", "dog", "horse", "car", "boat" };
		Scanner reader = new Scanner(System.in);
		int initialize = 1;
		HashMap<String, String> pairs = new HashMap<>();
		for(int i = 0; i < Finnish.length;i++) {
			pairs.put(English[i], Finnish[i]);
		}
		while(initialize == 1 || initialize == 2) {
			System.out.print("Do you want to\n1. Browse The Lexicon ?\n2. Add Words Into Lexicon ?");
			initialize = reader.nextInt();
			
			switch(initialize) {
				case 1:
					lexiconContent(pairs);
					searchWords(pairs);
					break;
					
				case 2:
					addWords(pairs);
					break;
			}
		}
		
			System.out.print("Aight we good ");
	}
	public static void lexiconContent(HashMap<String, String> pairs) {
		System.out.print("The Lexicon content:  { | ");
		for (String string : pairs.keySet()) {
			System.out.print( string +  " = " + pairs.get(string) + " | ");
		}
		System.out.print("}\n");
		
	}
	public static void searchWords(HashMap<String, String> pairs) {
		Scanner reader = new Scanner(System.in);
		String loop = "initialize";
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
	}
	public static void addWords(HashMap<String, String> pairs) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Word in English: ");
		String eng = reader.nextLine();
		System.out.print("Word in Finnish: ");
		String fin = reader.nextLine();
		pairs.put(eng,fin);
	}
}
