package nest4codeassignment;
import java.util.Scanner;


public class assignment2_2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Date: ");
	int date=sc.nextInt();
	if(date%4==0) {
		if(date%100==0) {
			if(date%400==0) {
				System.out.println("Date in Leap Year");
			}
			else{
				System.out.println("Date Not in Leap Year");

			}
			

		}
		else {
			System.out.println("Date in Leap Year");

		}
		
	}
	
	else {
		System.out.println("Date Not in Leap Year");

	}

}
}
