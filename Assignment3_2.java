package nest4codeassignment;

import java.util.Scanner;

public class Assignment3_2 {
	public static void main(String[] args) {
		System.out.print("Number: ");
		Scanner scan=new Scanner(System.in);
	
				int n=scan.nextInt();
				for (int i=1;i<=n;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print("*");
						
					}
					System.out.println();
				}
				for (int i=1;i<=n-1;i++) {
					for (int j=n;j>i;j--) {
						System.out.print("*");
						
					}
					
					System.out.println();
					
				}
				
				
				
				
	}

}
