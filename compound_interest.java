import java.util.Scanner;
public class compound_interest {
    public static void main(String[] args){

        //compound interest calculation

        Scanner scanner= new Scanner(System.in);
        double principal;
        double rate;
        int year;
        int timeCompounded;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal =scanner.nextDouble();

        System.out.print("Enter the interest rate (in %)");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter the time compounded per year: ");
        timeCompounded=scanner.nextInt();

        System.out.print("Enter the # of year:");
        year= scanner.nextInt();

        amount = principal * Math.pow(1+rate / timeCompounded, timeCompounded * year);

        System.out.print("The amount after the " + year + "is : $" + amount );
        scanner.close();
    }
}
