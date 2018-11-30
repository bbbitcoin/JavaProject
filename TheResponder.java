//author:James Tellez

package theResponder;

import java.util.Scanner;

public class TheResponder {

	public static void main(String[] args) {
		System.out.println("English or Spanish? (E/S)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		
		char response = 'e';
		
		if(input.charAt(0) == response)
		{
			System.out.println("Hi, how are you?");
		}

	}

}
