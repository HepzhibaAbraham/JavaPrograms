package week1.march;

import java.util.Scanner;

public class ReverseNumber3 {

	public static void main(String[] args) {
		// Using StringBuilder Class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		
		StringBuilder builder = new StringBuilder();
		StringBuilder reverse = builder.append(number).reverse();
		
		System.out.println("Reversed number is "+reverse);
		scan.close();
	}

}
