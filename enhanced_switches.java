import java.util.Scanner;
public class enhanced_switches {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // Enhanced switch = A replacement to many else if startments
        //                     (Java14 feature)
        String Day;
        System.out.print("Enter the day you want to check: ");
        Day = scanner.next();

//        switch (Day){
//            case "Monday" -> System.out.println("It is the weekday 😒");
//            case "Tuesday" -> System.out.println("It is the weekday 😒");
//            case "Wednesday" -> System.out.println("It is the weekday 😒");
//            case "Thursday" -> System.out.println("It is the weekday 😒");
//            case "Friday" -> System.out.println("It is the weekday 😒");
//            case "Saturday" -> System.out.println("It is the weekend😊");
//            case "Sunday" -> System.out.println("It is the weekend😊");
//            default -> System.out.println(Day + " is not a day");
//        }
        switch (Day){
            case "Monday" ,"Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is the weekday 😒");

            case "Saturday" -> System.out.println("It is the weekend😊");
            case "Sunday" -> System.out.println("It is the weekend😊");
            default -> System.out.println(Day + " is not a day");
        }

        scanner.close();

    }
}
