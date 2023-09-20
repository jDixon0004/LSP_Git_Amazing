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
				String line = scanner.nextLine().toLowerCase();
				String word = "";
				
				for(int i = 0; i < line.length(); i++) {
					char temp = line.charAt(i);
					if(temp >= 'a' && temp <= 'z') {
						word = word + temp;
					}
					else {
						if(!word.isEmpty()) {
							if(word.length() > 3) {
								Integer currentValue = map.get(word);
								if(currentValue != null) {
									map.put(word, currentValue + 1);
								}
								else {
									map.put(word, 1);
								}
							}

							word = "";
						}
					}
				}
			}
			scanner.close();
			
			Iterator<String> i = map.keySet().iterator();
			while(i.hasNext()) {
				String temp = i.next();
				if(temp.length() < 8)
					System.out.println(String.format("%s\t\t%d\n", temp, map.get(temp)));
				else if (temp.length() < 16)
					System.out.println(String.format("%s\t%d\n", temp, map.get(temp)));
				else
					System.out.println(String.format("%s%d\n", temp, map.get(temp)));
					
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
