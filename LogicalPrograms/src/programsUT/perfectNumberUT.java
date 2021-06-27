package programsUT;

import java.util.Scanner;

public class perfectNumberUT {
	Scanner scanner;
	
	public perfectNumberUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		int i=1;
		int sum=0;
		System.out.println("Enter value to calculate perfect number:: ");
		double number = scanner.nextInt();
		while(i<=number/2)
	    {
	        if(number%i == 0)
	        {
	            sum+=i;
	        }
	        i++;
	    }
		if (sum==number) {
			System.out.println("Perfect number::" +sum);
		}
		else {
			System.out.println("Not a perfect number");
		}
	}
}
