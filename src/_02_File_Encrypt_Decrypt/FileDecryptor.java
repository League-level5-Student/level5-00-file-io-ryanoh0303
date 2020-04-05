package _02_File_Encrypt_Decrypt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("src/_02_File_Encrypt_Decrypt/text.txt");
		String finaltoPrint = "";
		int word =0;
		while(word!= -1){
			System.out.print(word);
			word = fr.read();
			if((char) word == ' ' ) {
				finaltoPrint= finaltoPrint +" ";
			}
			
			else if(word<=100) {
	
			   finaltoPrint = finaltoPrint+  (char)(word+22);
			}
			else if(word>100) {
				finaltoPrint += (char)(word-4);
			}
			
		}
		fr.close();
		//System.out.println(finaltoPrint);
		JOptionPane.showMessageDialog(null, finaltoPrint);
	}
	
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *	 * and converting it back into text that you or the computer can read and understand.

	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
}
