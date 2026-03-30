import java.util.Scanner;
public class count_down {
        public static void main(String[] args) throws InterruptedException{

            //WAP TO COUNTDOWN THE NUMBER AND WISH HAPPY NEW YEAR

            Scanner scanner =new Scanner(System.in);

            int STARTS;

            System.out.println("Enter the number that the countdown will starts : ");
            STARTS = scanner.nextInt();
            for (int i=STARTS;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);//this is use to insert the countdown by using thread.sleep and p.s.v.m() throws InterruptedException
            }
            System.out.println("HAPPY NEW YEAR! 🎉🎉🎊🎆🎆🎆🎇🎇");
        }
}
