package day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = scan.nextInt();

		int sum = 0;

//		String str = String.valueOf(num);
//
//		for (char ch : str.toCharArray()) {
//
//			sum = sum + (ch - '0');
//
//		}
		
		while (num>0) {
			
			int rem = num%10;
			
			sum = sum+rem;
			
			num = num/10;
			
		}
		
		System.out.println(sum);

		scan.close();
	}

}
