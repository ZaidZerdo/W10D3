package main;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExampleFileChooser {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFileChooser open = new JFileChooser();
		
		int action = open.showOpenDialog(null);
		
		if (action == JFileChooser.APPROVE_OPTION) {
			System.out.println("You opened a file!");
			File f = open.getSelectedFile();
			// Absolute: C:/Users/Zaid/Desktop/Bezze.txt
			// Path: Bezze.txt
			// Desktop/Bezze.txt
			
			f.delete();
		} else if (action == JFileChooser.CANCEL_OPTION) {
			System.out.println("You canceled!");
		}
		
		JFileChooser save = new JFileChooser("C:/Users/Zaid/Desktop");
		
		int action2 = save.showSaveDialog(null);
		
		
	}

}
