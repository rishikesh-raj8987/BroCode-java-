import java.util.Scanner;

public class search_an_array {
    public static void main(String[] args){


        Scanner scanner =new Scanner(System.in);
        int [] numbers = {1,5,9,6,4,3};
        int target;
         boolean isFound = false;
        System.out.print("Enter the target elemet:");
        target = scanner.nextInt();




        for (int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index:" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element is not found in the array");
        }
    }
}
