package week1.march;

public class SwapNumbers2 {
	
	//Using Operators
	
	public static void main(String[] args) {
		float x = 123.5f;
		float y = 69.9f;
		
		System.out.println("Before Swapping: "+x +" "+y);
		x = x*y;
		y = x/y;
		x = x/y;
		
		System.out.println("After Swapping: "+x +" "+y);
	}

}
