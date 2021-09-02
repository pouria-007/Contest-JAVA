import java.util.Scanner;

public class Main {
	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		//put input in array
		char[] inputArray = new char[input.length()];
		for(int i = 0; i < input.length(); i++){
			inputArray[i] = input.charAt(i);
		}

		char[] vowels = new char[]{'a','A','i','I','o','O','y','Y','u','U','e','E'};
		
		//remove the vowels 
		for(int i = 0; i < input.length(); i++){
			for(int j = 0; j < 12; j++){
				if (inputArray[i] == vowels[j]){
					inputArray[i] = '@';
				}
			}
		}

		for(int i = 0; i < input.length(); i++){
			if(inputArray[i] != '@'){
				System.out.print('.');
				System.out.print(Character.toLowerCase(inputArray[i]));
			}
		}
		System.out.println();
	}
}
