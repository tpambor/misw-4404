package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Editor {
	SpellChecker spellChecker = new SpellChecker();

	private void displayResult(String[] errors) {
		if (errors.length == 0) {
			System.out.println("No errors found!");
			return;
		}

		for(String error : errors) {
			System.out.println("ERROR: " + error);
		}
	}
	
	private String readLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void runEditor() {
		System.out.println("Running editor...");
		
		System.out.println("Enter text:");
		String text = readLine();
		if (text == null)
			return;

		spellChecker.check(text);
		displayResult(spellChecker.getErrors());
	}
	
	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.runEditor();
	}
}
