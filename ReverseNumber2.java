package week1.march;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		// Using StringBuffer Class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		
		StringBuffer buffer = new StringBuffer(String.valueOf(number));
		StringBuffer reverse = buffer.reverse();
		
		System.out.println("Reversed number is "+reverse);
		scan.close();
	}

}
