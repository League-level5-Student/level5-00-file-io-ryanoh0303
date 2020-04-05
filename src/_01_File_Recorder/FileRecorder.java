package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) throws IOException {
		String input = JOptionPane.showInputDialog("TYPE A Message");
		FileWriter fw = new FileWriter("src/_01_File_Recorder/test3.txt");
		fw.write(input);
		fw.close();
		
	}
}
