package Basic_Core_Program;
import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int powerofTwo=1;
	for (int i=0; i<=N; i++)
	{
		powerofTwo=2*powerofTwo;
		System.out.println(+powerofTwo);
	}
	}
}