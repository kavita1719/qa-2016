package Login;

import java.util.Scanner;

public class MultiClass {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		System.out.println("Enter your favorite dish " );
		String favdish = input.nextLine();
		String name = input.nextLine();
count countObject = new count();
//passing parameter in the class
countObject.count(name);
countObject.first();
//calling method from another class
countObject.printAgain();
//creating object and calling a method from that class

classtwo twoObject = new classtwo();
twoObject.getdish();
twoObject.printing();


	}

}
