package bookReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainReadBook {


	public static void main(String[] args) throws IOException {

		File f = new File("book.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		System.out.println("type word you want to find");
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		String word = inputReader.readLine();

		String line = null;
		int length = 0;
		int totalLineNum = 0;
		int mutchedLines = 0;
		
		
		
		while ((line = reader.readLine()) != null) {
			if(line.contains(word)){
				
				if(length>=1000){
					
					int s=(line.length()-1000);
					
					String subline= line.substring(0, s);
//					
					line =subline;
				}
				length+=line.length();
				System.out.println(line +" "+ line.length());
				mutchedLines++;
//				
				
				
			}	
			totalLineNum++;
//			else{
//				System.out.println("word is not founded");
//			}
		}
		
		
		reader.close();
		System.out.println("Length of matched lines in characters: "+ length);
		System.out.println("lines TOTAL: " + totalLineNum);
		System.out.println("Number of MUTHCED lines: "+ mutchedLines);
	}

}

		
	