package week1.march;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		// Using Scanner class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		int reverse = 0;
		
		while(number!=0)
		{
			reverse = reverse*10 + number%10; 
			number = number/10;
		}
		System.out.println("Reversed number is "+reverse);
		scan.close();
	}

}
