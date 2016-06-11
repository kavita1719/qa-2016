package Login;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ParkProgram {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int adultfee = 13;
//int childage;
		
/*Scanner enter = new Scanner(System.in);
System.out.print("Enter your age : " );
int age = enter.nextInt();
if (age >=13)
{int fee=10;
System.out.println("This is an adult and adult fee applies");}
else
{int fee=7;
System.out.println("This is a child and child fee applies");}*/

	int adults;
	int children;
	adults = Integer.parseInt(JOptionPane.showInputDialog("Please input # of adults : "));
	children = Integer.parseInt(JOptionPane.showInputDialog("Please input # of children :"));
	int child = 7;
	int childfee;
	int adult = 13;
	int adultfee;
	int totalfee;
	childfee = children * child;
	System.out.println("Total for " + children + " children fee is  :" + childfee);
	adultfee = adult * adults;
	System.out.println("Total for " + adults + "  adilt fee is : " + adultfee );
	System.out.println("Total fee is:" + (adultfee+childfee));
		
	}

}
