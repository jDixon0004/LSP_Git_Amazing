package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		try {
			// Create file object
			File file = new File("src/main/resources/words.txt");
			// Create scanner object to read from file
			Scanner scanner = new Scanner(file);
			// Create hashmap object to store words and their frequency
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			while(scanner.hasNextLine()) {
				// Read in line from file and make lower case to avoid bad counting
				String line = scanner.nextLine().toLowerCase();
				String word = "";
				
				// Iterate through characters in read line and identify words from those characters
				for(int i = 0; i < line.length(); i++) {
					char temp = line.charAt(i); // Current character being looked at
					
					if(temp >= 'a' && temp <= 'z') {
						// Current read character is a letter, so add it to the current word
						word = word + temp;
					}
					else {
						// Current read character is not a letter
						
						if(!word.isEmpty()) {
							if(word.length() > 3) {
								Integer currentValue = map.get(word);
								if(currentValue != null) {
									// Word already exists in frequency map, so increment the frequency
									map.put(word, currentValue + 1);
								}
								else {
									// Word does not exist in frequency map, so insert the word and set frequency to 1
									map.put(word, 1);
								}
							}
							
							// Clear the word so that next word can be processed
							word = "";
						}
					}
				}
			}
			scanner.close();
			
			Iterator<String> i = map.keySet().iterator();
			
			// Iterate through set of keys in order to print out frequency map
			while(i.hasNext()) {
				String temp = i.next();
				
				// Print out frequency map with appropriate amount of tab characters for cleanliness
				if(temp.length() < 8)
					System.out.println(String.format("%s\t\t%d\n", temp, map.get(temp)));
				else if (temp.length() < 16)
					System.out.println(String.format("%s\t%d\n", temp, map.get(temp)));
				else
					System.out.println(String.format("%s%d\n", temp, map.get(temp)));
					
			}
			
		} catch(FileNotFoundException e) {
			// Exception for bad path name
			e.printStackTrace();
		}
	}

}
