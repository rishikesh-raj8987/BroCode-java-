import java.util.Arrays;
public class arrays {
    public static void main (String [] args){

        //array =a collection of values of the same data type
        //       * think ot it as a variable that can store more than 1 value*
        String[] fruits = {"apple", "orange", "banana" , "coconut"};

//        System.out.println(fruits[2]);
//
//        fruits[1] = "pineapple";
//        System.out.println(fruits[1]);
//
//        int numofFruits= fruits.length;
//        System.out.println(numofFruits);
//
//        for (int i = 0;i<fruits.length;i++){
//            System.out.print(fruits[i] +" ");
//        }
//        Arrays.sort(fruits);//it will sort the array elements in ascending order.
        Arrays.fill(fruits,"pineapple");

        for (String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
