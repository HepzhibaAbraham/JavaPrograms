package week1.march;

public class SwapNumbers1 {
	
	//Using Temporary variable
	
	public static void main(String[] args) {
		String a = "CORE";
		String b = "JAVA";
		
		System.out.println("Before Swapping: "+a +" "+b);
		String temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping: "+a +" "+b);
	}

}
