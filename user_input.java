import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name =sc.nextLine();

        System.out.print("Enter your age");
        int age= sc.nextInt();

        System.out.print("What is your GPA:");
        float gpa = sc.nextFloat();

        System.out.print("Are you a Student? (True/ False):");
        boolean student =sc.nextBoolean();



        System.out.println("Hello"+ name);
        System.out.println("I am " +age+ " years old");
        System.out.println("Your GPA is" +gpa);
       if (student){
           System.out.println("You are Enrolled");
       }
       else {
           System.out.println("Your are not enrolled");
       }

        sc.close();
    }
}
