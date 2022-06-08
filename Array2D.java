package Basic_Core_Program;
import java.util.Scanner;

public class Array2D {
	
	static void arrayLib() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number Of Row You Wants To Store");
		int R =  sc.nextInt();
		System.out.println("Enter the Number Of Colom You Wants To Store");
		int C =  sc.nextInt();
		//System.out.println("Enter the Number Of Element You Wants To Store");
		//int N =  sc.nextInt();


		
		int a[][]= new int[R][C];
		System.out.println("Enter The Elements Of The Array ");
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {

				a[i][j]=sc.nextInt();
				}
			}
			System.out.println("arry elements are");
	
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) 

				System.out.print(a[i][j]+" ");
				System.out.println();
				
			}
	}
	
	public static void main(String[] args) {
		arrayLib();
	}
	

}
