import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        // get inputs and store them 
        Scanner sc = new Scanner(System.in);
        int NumberOfGroups = sc.nextInt();

        int[] groups = new int[NumberOfGroups];
        
        for (int i = 0; i < NumberOfGroups; i++) {
            int group = sc.nextInt();
            groups[i] = group;
        }

        // how many taxies we need ?

        Arrays.sort(groups);

        int taxi = 0;
        int n = 0;
        int taxies_needed = 0;
        if(NumberOfGroups != 1){
            for (int i = 0; i < NumberOfGroups-1-n; i++){   
                taxi += groups[i];
                while(groups[i] + groups[NumberOfGroups-1-n] > 4) {
                    groups[NumberOfGroups-1-n] = 5;
                    n++;
                    taxies_needed++;
                    if (NumberOfGroups-1-n == i){
                        break;
                    }
                }
                groups[i] = 5;
                if (!(taxi + groups[NumberOfGroups-1-n] > 4)) {
                    taxi += groups[NumberOfGroups-1-n];
                    groups[NumberOfGroups-1-n] = 5;
                    n++;
                }
                if (taxi + groups[i+1] > 4 || taxi == 4){
                    taxies_needed++;
                    taxi = 0;          
                }
                else if (i >= NumberOfGroups-1-n){
                    taxies_needed++;
                }
            }

            for(int i : groups){
                if (i != 5){
                    taxies_needed++;
                }
            }
            System.out.println(taxies_needed);
        }
        else{
            taxies_needed = 1;
            System.out.println(taxies_needed);
        }  
    }
}
