package day1;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Enter a value to print Fibonnaci Series : " );
		
		int num = scanner.nextInt();
		
		int CN;
		int BN = 0;
		int AN = 1;
		
		for (int i = 0; i <=num; i++) {
			
			System.out.print(BN + " ");
			
			CN= AN + BN;
			
			AN = BN;
			
			BN = CN;
			
		}
		
		scanner.close();
	}

}
