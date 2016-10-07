package characters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Characters {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String directoryName = sc.nextLine();
		File directory = new File(directoryName);
		
		File[] fList = directory.listFiles();
		String[] list = directory.list();
		

		for (int j = 0; j < fList.length; j++) {
			File f = Paths.get(directoryName + "/" + list[j]).toFile();
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(f));

			int allSymbols = 0;
			int nums = 0;
			int chars = 0;
			int spaces = 0;
			int smallChars = 0;
			int bigChars = 0;
			String line = reader.readLine();

			while (line != null) {
				for (int i = 0; i < line.length(); i++) {
					char character = line.charAt(i);

					allSymbols++;

					if (Character.isLetter(character)) {
						chars++;

					} else if (Character.isDigit(character)) {
						nums++;

					}
					if (Character.isLowerCase(character)) {
						smallChars++;

					}
					if (Character.isUpperCase(character)) {
						bigChars++;

					}
					if (Character.isWhitespace(character)) {
						spaces++;
					}
				}
				line = reader.readLine();
			}
			System.out.println(f.getName());
			System.out.println("All symbols: " + allSymbols);
			System.out.println("Numbers: " + nums);
			System.out.println("Chars only: " + chars);
			System.out.println("Spaces: " + spaces);
			System.out.println("Small chars: " + smallChars);
			System.out.println("Big chars: " + bigChars);
		}
	}
}
