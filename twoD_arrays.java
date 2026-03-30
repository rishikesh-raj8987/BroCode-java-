public class twoD_arrays {
    public static void main(String[] args){

        // 2d array = An array where each element is an array  useful for storing a matrix of data


        // same as the we write this in below for thesse strings
//        String[] fruits ={ " apple", "orange", "banana"};
//        String[] vegetable ={"potato", "onion", "carrot"};
//        String[] foods1 = {"Pizza", "Burger", "hot dog"};

        String [][] groceries = {{ "apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"Pizza", "Burger", "hot dog"}};
        groceries[0][1] = "mango"; //it is use for the repalcement of the elements in a matrix[i][j]
        groceries[2][2] ="cheaps";

        for(String[] foods : groceries ){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }


    }
}
