package Basic_Core_Program;
import java.util.Scanner;


public class Flip_Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a=0;
		int b=0;
		for(int i=0; i<N; i++) 
		{
			
			int Fliping = (int) Math.floor(Math.random()*10)%2+1;
			switch (Fliping) {
			case 1 :
			a++;
			break;
			case 2 : 
			b++;
			break;
			default: 
				break;
				}
		}
		float PH=(a/b);
		System.out.println(+a);
	
		System.out.println("Percantage Of Heads Vs Tails IS.."+PH);
		
	}
	}

