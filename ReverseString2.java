/**
 * 
 */
package week1.march;

import java.util.Scanner;

public class ReverseString2 {

	//Using Character array
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.next();
	
		int size= str.length();
		String reverse = "";
		
		for(int i=size-1;i>=0;i--)
		{
			char[] a = str.toCharArray();
			reverse = reverse + a[i];
		}
		
		System.out.println("The reversed string is "+reverse);
		scan.close();
	}

}
