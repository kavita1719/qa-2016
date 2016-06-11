package Login;

import java.util.Scanner;

public class MakeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int line[] = {12,34,78,34,78};
String name[] = {"one", "two","three","four", "five"};
System.out.println("Counter  \tNumber  \tWord");
	
	for (int i = 0; i< name.length; i++)
	{
	System.out.println(i + "\t" + "\t" + line[i]+ "\t" + "\t" +name[i]);
	}
Scanner input = new Scanner(System.in);
System.out.println("Enter your age : ");
int age = input.nextInt();
switch(age){
case 12:

System.out.println("You are a teenager");
break;
case 20:
	System.out.println("You are in your 20s");	
	
}
	


	}

}
