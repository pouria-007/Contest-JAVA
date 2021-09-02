import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //store input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // chek if it contains H,9 or Q
        boolean find = false;

        for(int i = 0; i < input.length(); i++){
            char test = input.charAt(i);
            if (test == 'H' || test == 'Q' || test == '9'){
                System.out.println("YES");
                find = true;
                break;
            }
        }

        if (find == false) {
            System.out.println("NO");
        }
    }
}