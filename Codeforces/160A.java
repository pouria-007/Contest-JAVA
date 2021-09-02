import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
    
        // get an input with nuber of coins
        Scanner sc = new Scanner(System.in);
        int NumberOfCoins = sc.nextInt();

        int[] wallet = new int[NumberOfCoins];

        for(int i = 0; i < NumberOfCoins; i++){
            int coin = sc.nextInt();
            wallet[i] = coin;
        }
        
        // order coins from largest to smallest
        int largest = wallet[0];

        for(int i = 0; i < NumberOfCoins; i++){
            for(int j = 0; j< NumberOfCoins; j++){

                if(wallet[i] >= wallet[j]){
                    largest = wallet[i];
                    
                    if(i < j){
                        int tempI = wallet[i];
                        int tempJ = wallet[j];
                        wallet[i] = tempJ;
                        wallet[j] = tempI;
                    }
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < NumberOfCoins; i++){
            sum += wallet[i];
        }
        float target = Math.round(sum/2);
        
        // sum up the largests 
        float MySum = 0f;
        int index = NumberOfCoins - 1;
        int NumberOfMyCoins = 0;
        while(MySum <= target){
            NumberOfMyCoins++;
            MySum += wallet[index];
            index--;
        }

        System.out.println(NumberOfMyCoins);
    }

}