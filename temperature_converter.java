import java.util.Scanner;
public class temperature_converter {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double Degrees_Fahrenheit;
        double Degrees_Celsius;
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter  the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? ( C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf( "%.2f°    %s", newTemp  , unit);  //to add degreee symboll ° = alt + 0176

        scanner.close();

    }
}
