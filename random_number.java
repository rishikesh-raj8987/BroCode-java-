import java.util.Random;
public class random_number {
    public static void main(String[] args){

     Random random = new Random();

//     int number1;
//     int number2;
//     int number3;

        double number1;
        double number2;
        double number3;

     number1 = random.nextDouble(1,1099);
     number2 = random.nextDouble(1,600);
     number3 = random.nextDouble(1,509);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
   }
}
