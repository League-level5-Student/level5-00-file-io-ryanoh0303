package _02_File_Encrypt_Decrypt;

import javax.swing.JOptionPane;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	public static void main(String[] args) {  //122-> 100
		                                      //121 ->99
		String finalWord = "";
		int key = Integer.parseInt(JOptionPane.showInputDialog("KEY: "));
		String word = JOptionPane.showInputDialog("WORD: ");
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==' ') {
				finalWord += ' ';
			}
			if(Character.isUpperCase(word.charAt(i))) {
				String x= (""+word.charAt(i)).toLowerCase();
				char xy = x.charAt(0);
				if((int) xy >= 122-key) {
					 finalWord += (char)(-1* (int) xy + 222) ;
				}
				else {
					finalWord += (char) (key+ (int)xy);
				}	
			}
			else {			
			if((int) word.charAt(i) >= 122-key) {
				 finalWord += (char)(-1* (int) word.charAt(i) + 222) ;
			}
			else {
				finalWord += (char) (key+ (int)word.charAt(i));
			}
		}
		}
		System.out.println("KEY: "+ key);
		System.out.println("WORD: "+ word);
		System.out.println("FINAL WORD: "+ finalWord);
		
	}
}
