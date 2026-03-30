import java.util.Scanner;

public class nested_loop_pattern {
    public static void main(String[] args) {

        // using nested loops make $ symboll of rectangle pattern

        Scanner scanner =new Scanner(System.in);
        int row;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows:");
        row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol:");
        symbol = scanner.next().charAt(0);

        for(int i = 0 ; i<=row;i++){
            for (int j = 0 ; j<= columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
