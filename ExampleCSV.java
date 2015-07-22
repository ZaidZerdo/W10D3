package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExampleCSV {

	// Šta je CSV file?
	// CSV - Comma (,) Separated Value
	
	/*
	 * Id: 3
	 * Person: Gordan Masic
	 * 
	 */
	
	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(new File("C:/Users/Zaid/Desktop/ourExample.csv")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}
		
		try {
			in.readLine();
			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				
				String id = st.nextToken();
				String name = st.nextToken();
				String surname = st.nextToken();
				
				System.out.println("ID: " + id);
				System.out.println("Person: " + name + " " + surname);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
