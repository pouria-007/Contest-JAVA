import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int[] dices = new int[3];

		for (int i = 0; i < 3; i++){
			int dice = sc.nextInt();
			dices[i] = dice;
		}
		
		if (dices[0] == dices[1]){
			System.out.println(dices[2]);
		}
		else if (dices[0] == dices[2]){
			System.out.println(dices[1]);
		}
		else if (dices[2] == dices[1]){
			System.out.println(dices[0]);
		}
		else {
			System.out.println(0);
		}
	}
}