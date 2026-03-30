 import java.util.Scanner;

public class if_statement {
    public static void main(String[]args){


//        if statement in java
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;


        System.out.print("Enter you name:");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();


        if (age>= 60) {
            System.out.println("Hello  " +name+ " " + "You are a senior citizen");

        }
         else if (age >= 18){
            System.out.println("Hello  " +name+ " "+ "You are adult!");
        }

        else if (age <0 ) {
            System.out.println("Hello  " +name+ "You haven't born yet");

        } else if (age == 0){
            System.out.println("Hello  " +name+ "You are new born baby");

        } else{
            System.out.println("Hello  " +name+ "You are a child!");
        }
    }
}
