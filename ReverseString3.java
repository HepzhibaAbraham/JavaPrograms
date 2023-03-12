/**
 * 
 */
package week1.march;

import java.util.Scanner;

public class ReverseString3 {

	//Using StringBuffer
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.next();
	
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		
		System.out.println("The reversed string is "+reverse);
		scan.close();
	}

}
