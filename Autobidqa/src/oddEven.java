import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int num = input.nextInt();
		int div = num % 2;
		System.out.println(div);
		
		 if ( div == 0)
		{
			System.out.println("The digit is even");
		}
		else 
		{System.out.println("odd digit");
		} 
		System.out.println("Enter for Prime number   : ");
		int number = input.nextInt();
		checkPrime(number);
		
		}
		
	public static void checkPrime (int num)
	{
		
		for (int i = 2; i < num; i++)
		{
			int temp = num % i;
		
			if(temp == 0)
			{
				System.out.println("Number is not prime");
				return;
			}
		}
		System.out.println(" Prime number");
		return;
	}
		
}


