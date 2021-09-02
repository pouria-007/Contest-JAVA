import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		long Friends = sc.nextLong();
		long Yen = sc.nextLong();
		
		long villages = 0;
		
		long[] FY = new long[10000000];
		
		for (int i = 0; i < Friends; i++) {
			
			int temp = sc.nextInt();
			long temp2 = sc.nextLong();
			FY[temp] += temp2;
		}
		
		while (villages <= Yen) {
			
			Yen += FY[(int)villages]; 
			villages++;
			
		}
		
		System.out.println(villages - 1);
	}
	
	
}