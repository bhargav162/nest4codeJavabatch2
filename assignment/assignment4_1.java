package nest4codeassignment;

import java.util.Scanner;

public class assignment4_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int x=0;
		int y=1;
		for (int i=0;i<n;i++) {
			System.out.println(x);
			int z=x+y;
			x=y;
			y=z;
			
		}
			
		}

}
