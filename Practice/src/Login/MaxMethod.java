package Login;

public class MaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int b = 4;
		int k = max(a, b);
		System.out.println("The maximum of the 2 number is : " + k);
		
	}
		public static int max(int a1, int b1){
			int result;
			if ( a1 > b1){
				result = a1;}
				else {
					result = b1; } 
				return result;
				
			}
		
		
	}


