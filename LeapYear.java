package Basic_Core_Program;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year in YYYY");
		Scanner sc = new Scanner (System.in);
		int year =sc.nextInt();
		
		int a= year%4;
		int b=year%100;
		int c=year%400;
		if (a==0) {
			if(b==0) {
				 if(c==0) {
					 System.out.println("year is a LeapYear");
					
				 }
				 else System.out.println("common year");
				 }
			else System.out.println("year  is LeapYear");
			}
		else 
				System.out.println("common year");
	}
	}
