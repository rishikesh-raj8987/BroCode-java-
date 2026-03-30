import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) throws InterruptedException{

        // for loop = execute some code  a certain amount of times
        Scanner scanner =new Scanner(System.in);
        int max;
        System.out.println("Enter the number that how many times you want to loop:");
        max = scanner.nextInt();

        for ( int i = max; i>0; i--){
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEAR");

    }
}
