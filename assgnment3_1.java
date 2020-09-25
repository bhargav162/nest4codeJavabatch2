package nest4codeassignment;
import java.util.*;
public class assgnment3_1 {

	public static void main(String[] args) {
		System.out.print("Number: ");
		Scanner scan=new Scanner(System.in);
	
				int n=scan.nextInt();
				int odd=0;
				int even=0;
				int r;
				while(n>0) {
					r=n%10;
					n=n/10;
					if(r%2==0) {
						even++;
					}
					else {
						odd++;
					}
				}
				System.out.println("Odd digit: " + odd);
				System.out.println("Even digit: " + even);
				
		

	}

}
