package day1;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static boolean isPrime(int num) {

		if (num <= 1) {

			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {

				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number for Prime number checking : ");

		int num = scan.nextInt();

		if (isPrime(num)) {

			System.out.println("The Number that you've entered is Prime");

		}

		else {

			System.out.println("The Number that you've entered is not Prime");
		}

		scan.close();
	}

}
