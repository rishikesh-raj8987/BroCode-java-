import java.util.Scanner;
public class math2_class {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double radius;
        double area;
        double circumference;
        double volume;

        System.out.print("Enter the radius of a cirle:");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow(radius,2);
        circumference = 2 * Math.PI * radius;
        volume = (4.0/3.0)* Math.PI * Math.pow(radius, 3 );

        System.out.printf(" The area of a Circle is: %.1fcm²\n", area);
        System.out.printf("The circumference of Circle is: %.1fcm\n" , circumference); // To show 1 digit after the decimal use this %.1fcm and change the printl:- printf
        System.out.println(" The volume of a circle is : " + volume);

        scanner.close();
    }
}
