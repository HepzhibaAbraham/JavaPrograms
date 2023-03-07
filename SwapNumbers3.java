package week1.march;

public class SwapNumbers3 {
	
	//Using Single Statements
	
	public static void main(String[] args) {
		int first = 510;
		int second = 180;
		
		System.out.println("Before Swapping: "+first +" "+second);
		
		second=(first+second)-(first=second);
		
		System.out.println("After Swapping: "+first +" "+second);
	}

}
