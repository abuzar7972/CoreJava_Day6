package programsUT;

import java.util.Scanner;

public class reverceNumberUT {
	Scanner scanner;
	
		public reverceNumberUT() {
		scanner = new Scanner(System.in);
			}
		
		public int getIntValue() {
			return scanner.nextInt();
			}
	public void check() {
	//int num=123456;
	System.out.print("enter number:: ");
	int num = scanner.nextInt();
	int lastDigit;
	int rev = 0;
	while(num != 0){
		lastDigit = num % 10;
	  rev = rev * 10 + lastDigit;
	  num = (int) Math.floor(num/10);
	}

	System.out.println("Reverse number : "+rev);
	}
}
