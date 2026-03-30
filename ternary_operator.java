public class ternary_operator {
    public static void main(String[] args){


        //ternary operator ? = Return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;

        int score = 95;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        int number = 3;
        String evenOrOdd = (number %2 == 0) ? "even": "Odd";

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
    }
}
