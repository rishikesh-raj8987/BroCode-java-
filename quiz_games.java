import java.util.Scanner;

public class quiz_games {
    public static void main(String[] args){


        //java quiz games
            String[] questions={"what is the main function of a router?",
                                "which part of the computer is considered the barin?",
                                "what year was Facebook launched?",
                                "who is know as the father of computer?",
                                "what was the first programming language"};

            String[][]options = {{"1.Storing files", "2. Encrupting data","3. Directing internet traffic","4.Managing Passwords"},
                                    {"1.Cpu","2. HArd Drive","3.2006","4.GPU"},
                                    {"1.2000","2.2004","3.2006","2008"},
                                    {"1.steve Jobs","2. Bill Gates","3.Alan Turing","4.Charles Babbage"},
                                    {"1.COBOL", "2. C", "3. Fortran","4.Assembly"}};

            int [] answers = {3,1,2,4,3};
            int score = 0;
            int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the java Quiz Game");
        System.out.println("*****************************");

        for(int i =0;i< questions.length;i++){
            System.out.println(questions[i]);

            for (String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess:");
            guess = scanner.nextInt();
            if(guess== answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }
        System.out.println("Your final score is "+score+"out of "+ questions.length);

        scanner.close();




    }
}
