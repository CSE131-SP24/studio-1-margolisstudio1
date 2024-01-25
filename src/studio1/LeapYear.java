package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
				
		boolean test1 = year % 100 != 0 && year % 4 == 0;
		boolean test2 = year % 400 == 0;
		boolean leapyear = test1 || test2;

		System.out.println(year + " is a leap year? " + leapyear);

	}

}