package Basic_Core_Program;
import java.util.Scanner;
public class NthHarmonic {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int i=1;
		
		for(i=1; i<=N;i++) {
			String a = (1+"/"+i+ " + ") ;
		 System.out.print(a);
		}
	}

}
