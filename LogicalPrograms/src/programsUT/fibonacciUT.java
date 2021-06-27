package programsUT;

import java.util.Scanner;

public class fibonacciUT {
		Scanner scanner;
			
			public fibonacciUT() {
				scanner = new Scanner(System.in);
			}
			public int getIntValue() {
				return scanner.nextInt();
				}
			public void check() {
				int perviousNumber=0;
				int nextNumber=1;
				System.out.println("Enter value to calculate series:: ");
				double maxNumber = scanner.nextInt();
				for (int i=1; i<=maxNumber; i++) {
					System.out.println("number:: " +perviousNumber);
					int sum = perviousNumber+nextNumber;
					perviousNumber=nextNumber;
					nextNumber=sum;
					
				}

}
}