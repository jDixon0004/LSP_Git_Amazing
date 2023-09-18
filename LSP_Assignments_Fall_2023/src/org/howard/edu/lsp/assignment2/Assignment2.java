package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		try {
			File file = new File("src/main/resources/words.txt");
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
