package Basic_Core_Program;
import java.util.Scanner;

public class Factors {


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	
	
	for (int i=2;i<N;i++) {
		while(N%i==0) {
		System.out.println(i+" ");
			N=N/i;
	
		}
		}
	if(N>2) {
		System.out.println(+N);
	}
	} 
	
	
}	


