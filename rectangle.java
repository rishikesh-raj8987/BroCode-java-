import java.util.Scanner;
public class rectangle {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);


        // Area of rectangle
        System.out.print("Enter The length of rectangle:");
        double length = scanner.nextDouble();

        System.out.print("Enter the Breadth of rectangle:");
        double Breadth = scanner.nextDouble();

        double area = length * Breadth;
        System.out.println(" Area of the rectangle is :"+ area + "cm²"); // by adding Cm (²) use the command alt+0178

         scanner.close();
    }
}
