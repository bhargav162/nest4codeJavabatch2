package nest4codeassignment;

import java.util.Scanner;

public class asignment2_1 {

	public static void main(String[] args) {
		System.out.println("Enter te time in seconds:");
		Scanner sc=new Scanner(System.in);
		int seconds=sc.nextInt();
		int secondsInMin=60;
		int h=seconds/3600;
		int m=(seconds-(3600-h))/60;
		int secondsInHour=secondsInMin*60;
		int secondsInDay=secondsInHour*24;
		int noOfDays= seconds/secondsInDay;
		int remainingSeconds=seconds-noOfDays*secondsInDay;
		int noOfHours=remainingSeconds/secondsInHour;
		remainingSeconds=remainingSeconds-noOfHours*secondsInHour;
		int noOfSeconds=remainingSeconds;
		System.out.println(noOfDays + "Days" +noOfHours + "Hours"+ m + "Minutes" + noOfSeconds+"Seconds" );
	
			
		

	}

}
