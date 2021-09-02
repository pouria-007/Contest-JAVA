import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int output = 0;
		
		for (int i = 1; i < N+1; i++){		
		
			for (int j = 1; j < K+1; j++) {
				
				int temp = (i * 100) + j;
				output += temp;
			}
			
		}
		
		System.out.println(output);
	}
}