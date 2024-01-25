package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The first of two integers to be averaged?");
		double n1 = scan.nextDouble();
		
		System.out.println("The second of two integers to be averaged?");
		double n2 = scan.nextDouble();
		
		double average = (n1 + n2)/2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average);

	}

}